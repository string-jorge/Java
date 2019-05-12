package com.jorge.jdbc;

import com.jorge.util.JDBCUtils;

import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 需求:
 *      1.通过键盘录入用户名和密码
 *      2.判断用户是否登录成功
 */


public class JDBC_Login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入您的用户名:");
            String username = sc.nextLine();
            System.out.println("请输入您的密码:");
            String password = sc.nextLine();

            boolean flag = login2(username, password);
            if(flag) {
                System.out.println("登陆成功!");
                break;
            }else{
                System.out.println("用户名或密码错误!");
            }
        }
    }

    //登录方法
    public static boolean login(String username, String password) {
        if(username != null && password != null) {
            //连接数据库判断是否登录成功

            Connection conn = null;
            Statement st = null;
            ResultSet rs = null;

            try {
                //1.获取连接
                conn = JDBCUtils.getConnection();

                //2.定义sql

                String sql = "select * from user where username = '" + username + "' and password = '" + password + "'";

                st = conn.createStatement();

                rs = st.executeQuery(sql);

                return rs.next();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                JDBCUtils.close(rs, st, conn);
            }
        }
        return false;
    }

    //登录方法
    //使用PrepareStatement对象,防止sql注入问题,更加安全
    public static boolean login2(String username, String password) {
        if(username != null && password != null) {
            //连接数据库判断是否登录成功

            Connection conn = null;
            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                //1.获取连接
                conn = JDBCUtils.getConnection();

                //2.定义sql

                String sql = "select * from user where username = ? and password = ?";

                ps = conn.prepareStatement(sql);

                ps.setString(1,username);
                ps.setString(2,password);

                rs = ps.executeQuery();

                return rs.next();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                JDBCUtils.close(rs, ps, conn);
            }
        }
        return false;
    }

}
