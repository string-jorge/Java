package com.jorge.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * JDBC工具类,使用Durid连接池
 */

public class JDBCUtils {

    private static DataSource ds;

    static{

        try {
            //1.加载配置文件
            Properties prop = new Properties();
            //使用ClassLoader加载配置文件,获取字节输入流
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            prop.load(is);

            //2.初始化连接池对象
            ds = DruidDataSourceFactory.createDataSource(prop);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接池对象
     */
    public static DataSource getDataSource() {
        return ds;
    }

    /**
     * 获取Connection连接对象
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

}
