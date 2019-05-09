package com.jorge.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * DriverManager:驱动管理对象
 *  功能:
 *      1.注册驱动
 *          static void registerDriver​(Driver driver):使用 DriverManager注册给定的驱动程序
 *          Class.forName("com.mysql.jdbc.Driver");
 *          通过查看源码发现:在com.mysql.jdbc.Driver类中存在静态代码块
 *          static {
                    try {
                        DriverManager.registerDriver(new Driver());
                    } catch (SQLException var1) {
                        throw new RuntimeException("Can't register driver!");
                    }
                 }
            注意:MySQL5之后的驱动jar包中可以省略注册驱动的步骤
 *      2.获取数据库连接
 *          方法:static Connection getConnection​(String url, String user, String password):尝试建立与给定数据库URL的连接
 *          参数:
 *              url:指定连接的路径
 *                  语法:jdbc:mysql://ip地址(域名):端口号/数据库名称
 *                  举例:jdbc:mysql://localhost:3306/jorge_mysql
 *                  细节:如果连接的是本机mysql服务默认的端口号是3306,则url可以简写为:jdbc:mysql:///数据库名称
 *              user:用户名
 *              password:密码
 */

public class DriverManager {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取数据库连接
        Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/jorge_jdbc", "root", "19990628");

        connection.close();
    }
}
