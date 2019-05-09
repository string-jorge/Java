package com.jorge.jdbc;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * Connection:数据库连接对象
 *      1.功能:
 *          1.获取执行sql语句的对象
 *              Statement createStatement​():创建一个 Statement对象，用于将SQL语句发送到数据库
 *              PreparedStatement prepareStatement​(String sql):创建一个 PreparedStatement对象，用于将参数化的SQL语句发送到数据库
 *          2.管理事务
 *              1.开启事务
 *                  void setAutoCommit​(boolean autoCommit):调用该方法设置参数为false,即开启事务
 *              2.提交事务
 *                  void commit​()
 *              3.回滚事务
 *                  void rollback​()
 */

public class Connection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取数据库连接
        java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/jorge_jdbc", "root", "19990628");

        //获取执行sql语句的对象
        Statement statement = connection.createStatement();

        statement.close();
        connection.close();

    }
}
