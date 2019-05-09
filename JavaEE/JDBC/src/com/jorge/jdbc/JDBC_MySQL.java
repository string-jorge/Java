package com.jorge.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_MySQL {

    public static void main(String[] args) throws Exception {
        //1.导入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("加载驱动成功...");
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jorge_jdbc", "root", "19990628");
        System.out.println("数据库连接成功...");
        //4.定义sql语句
        String sql = "insert into student(id,name,age) values (5,'周七',27)";
        //5.获取执行sql的对象:Statement
        Statement stat = conn.createStatement();
        //6.执行sql
        int result = stat.executeUpdate(sql);
        //7.处理结果
        System.out.print(result);
        //8.释放资源
        stat.close();
        conn.close();
    }
}
