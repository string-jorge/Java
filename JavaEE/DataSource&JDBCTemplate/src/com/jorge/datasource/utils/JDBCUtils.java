package com.jorge.datasource.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {

    /**
     * Druid连接池的工具类
     */

    //1.定义成员变量
    private static DataSource ds;

    static{
        try {
            //1.加载配置文件
            Properties prop = new Properties();
            prop.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));

            //2.获取DataSource
            ds = DruidDataSourceFactory.createDataSource(prop);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //获取连接
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    //释放资源
    public static void close(Statement st, Connection conn) {
        /*if (st != null) {
            try {
                st.close();   //归还连接
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();   //归还连接
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/

        close(null,st,conn);
    }

    public static void close(ResultSet rs, Statement st, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();   //归还连接
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //获取连接池
    public static DataSource getDataSource() {
        return ds;
    }

}
