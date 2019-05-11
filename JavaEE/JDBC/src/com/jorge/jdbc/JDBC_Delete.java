package com.jorge.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Delete {

    public static void main(String[] args) {

        Connection conn = null;
        Statement stat = null;

        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");

            //2.获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jorge_jdbc", "root", "19990628");

            //3.定义sql
            String sql = "delete from student where id = 5";

            //4.获取执行sql的对象
            stat = conn.createStatement();

            //5.执行sql
            int result = stat.executeUpdate(sql);

            //6.处理返回的结果
            if (result > 0) {
                System.out.print("删除成功！");
            } else {
                System.out.print("删除失败！");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //7.释放资源
            if (stat != null) {
                try {
                    stat.close();
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
