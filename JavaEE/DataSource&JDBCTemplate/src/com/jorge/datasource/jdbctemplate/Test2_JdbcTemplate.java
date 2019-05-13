package com.jorge.datasource.jdbctemplate;

import com.jorge.datasource.domain.Student;
import com.jorge.datasource.utils.JDBCUtils;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Test2_JdbcTemplate {

    //获取JdbcTemplate对象
    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    //1.修改1号数据 salary 为10000
    @Test
    public void test1() {

        //定义sql
        String sql = "update student set salary = 10000 where id = 1";

        int count = template.update(sql);

        Assert.assertEquals(1,count);

    }

    //2.添加一条记录
    @Test
    public void test2() {

        //定义sql
        String sql = "insert into student values (?,?,?,?,?)";

        int count = template.update(sql,5,"周七",27,"2019-04-23",3000);

        Assert.assertEquals(1,count);
    }

    //3.删除刚才添加的记录
    @Test
    public void test3() {

        //定义sql
        String sql = "delete from student where id = ?";

        int count = template.update(sql, 5);

        Assert.assertEquals(1,count);
    }

    //4.查询id为1的记录,将其封装为Map集合
    //注意:查询的结果集长度只能是1
    @Test
    public void test4() {
        String sql = "select * from student where id = ?";

        Map<String, Object> map = template.queryForMap(sql, 1);

        System.out.println(map);
        //{id=1, name=张三, age=23, join_date=2019-05-10, salary=10000.0}
    }

    //5.查询所有记录,将其封装为List
    //注意:将每一条记录封装为Map集合,再将Map集合装载到List集合中
    @Test
    public void test5() {
        String sql = "select * from student";

        List<Map<String, Object>> list = template.queryForList(sql);

        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
    }

    //6.查询所有记录,将其封装为Student对象的List集合
    @Test
    public void test6_1() {
        String sql = "select * from student";

        List<Student> list = template.query(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student s = new Student();

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Date join_date = rs.getDate("join_date");
                double salary = rs.getDouble("salary");

                s.setId(id);
                s.setName(name);
                s.setAge(age);
                s.setJoin_date(join_date);
                s.setSalary(salary);
                return s;
            }
        });

        for (Student student : list) {
            System.out.println(student);
        }
    }

    //6.查询所有记录,将其封装为Student对象的List集合
    @Test
    public void test6_2() {
        String sql = "select * from student";

        List<Student> list = template.query(sql, new BeanPropertyRowMapper<>(Student.class));   //query完成数据到JavaBean的自动封装,一般使用new BeanPropertyRowMapper<类型>(类型.class)实现类

        for (Student student : list) {
            System.out.println(student);
        }
    }

    //7.查询总记录数
    @Test
    public void test7() {
        String sql = "select count(id) from student";

        Long total = template.queryForObject(sql, long.class);  //queryForObject用于查询聚合函数

        System.out.println(total);
    }

}
