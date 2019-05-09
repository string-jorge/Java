package com.jorge.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Statement:执行sql语句对象
 *      1.执行sql
 *          1.boolean execute​(String sql):可以执行任意的sql(了解)
 *          2.int executeUpdate​(String sql):执行DML(insert,update,delect)语句,DDL(create,alter,drop)语句
 *              返回值:影响的行数,可以通过这个影响的行数判断DML语句是否执行成功,返回值大于0则执行成功,反之,则失败
 *          3.ResultSet executeQuery​(String sql):执行DQL(select)语句
 */

public class Statement {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取数据库连接
        java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/jorge_jdbc", "root", "19990628");

        //获取执行sql语句的对象
        java.sql.Statement statement = connection.createStatement();

        //删除数据
        /*int result = statement.executeUpdate("delete from student where id = 5");
        System.out.println(result);*/

        //查询数据
        ResultSet resultSet = statement.executeQuery("select * from student");
        System.out.println(resultSet.next());

        resultSet.close();
        statement.close();
        connection.close();

    }
}
