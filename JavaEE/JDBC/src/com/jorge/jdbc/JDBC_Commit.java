package com.jorge.jdbc;

import com.jorge.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * JDBC事务管理
 */

public class JDBC_Commit {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        try {
            //获取连接
            conn = JDBCUtils.getConnection();

            //开启事务
            conn.setAutoCommit(false);

            //定义与执行的sql
            String sql1 = "update account set balance = balance - ? where id = ?";
            String sql2 = "update account set balance = balance + ? where id = ?";

            //获取执行sql对象
            ps1 = conn.prepareStatement(sql1);
            ps2 = conn.prepareStatement(sql2);

            //设置参数
            ps1.setDouble(1,500);
            ps1.setInt(2,1);
            ps2.setDouble(1,500);
            ps2.setInt(2,2);

            //执行sql
            ps1.executeUpdate();
            ps2.executeUpdate();

            //提交事务
            conn.commit();
        } catch (Exception e) {
            //回滚事务
            try {
                if(conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(ps1,conn);
            JDBCUtils.close(ps2,null);
        }

    }

}
