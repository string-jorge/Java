package com.jorge.jdbc;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//查询,返回ResultSet
public class JDBC_Query {

    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;

        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");

            //2.获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jorge_jdbc", "root", "19990628");

            //3.定义sql
            String sql = "select * from student";

            //4.获取执行sql的对象
            st = conn.createStatement();

            //5.执行sql
            ResultSet re = st.executeQuery(sql);

            //6.处理返回的结果
            while (re.next()) {
                int id = re.getInt("id");
                String name = re.getString(2);
                int age = re.getInt("age");

                System.out.println("id:" + id + ",name:" + name + ",age:" + age);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //7.释放资源
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
