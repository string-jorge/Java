package com.jorge.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//向jorge_jdbc数据库的student添加一条记录
public class JDBC {

    public static void main(String[] args) {

        Statement stat = null;
        Connection conn = null;

        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");

            //2.获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jorge_jdbc", "root", "19990628");

            //3.定义sql
            String sql = "insert into student(id,name,age) values (5,'周七',27)";

            //4.获取执行sql语句的对象
            stat = conn.createStatement();

            //5.执行sql
            int result = stat.executeUpdate(sql);
            //6.处理结果
            if(result > 0) {
                System.out.print("添加成功!");
            }else{
                System.out.print("添加失败!");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //7.释放资源
            if(stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
