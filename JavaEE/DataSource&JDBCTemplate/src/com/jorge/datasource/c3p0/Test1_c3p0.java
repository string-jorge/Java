package com.jorge.datasource.c3p0;

/*
    c3p0的演示
 */

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Test1_c3p0 {

    //1.导入jar包,也要导入jdbc驱动jar包
    //2.src目录定义c3p0-config.xml 或者  c3p0-config.properties配置文件

    public static void main(String[] args) throws SQLException {

        //3.创建数据库连接池对象
        DataSource ds = new ComboPooledDataSource();

        //4.获取连接对象
        Connection conn = ds.getConnection();

        //打印
        System.out.println(conn);

    }

}
