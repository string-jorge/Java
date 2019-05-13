package com.jorge.datasource.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/*
    druid演示
 */

public class Test1_Druid {

    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2.定义配置文件
        //3.加载配置文件
        Properties prop = new Properties();
        InputStream is = Test1_Druid.class.getClassLoader().getResourceAsStream("druid.properties");
        prop.load(is);
        //4.获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);

        //5.获取连接对象
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }

}
