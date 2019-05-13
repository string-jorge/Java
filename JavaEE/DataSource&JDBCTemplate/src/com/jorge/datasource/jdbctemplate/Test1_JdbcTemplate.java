package com.jorge.datasource.jdbctemplate;

//JdbcTemplate入门

import com.jorge.datasource.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test1_JdbcTemplate {

    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

        //3.调用方法
        String sql = "update account set balance = ? where id = ?";
        int count = template.update(sql, 3000, 3);
        System.out.println(count);

    }

}
