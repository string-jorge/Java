package com.jorge.datasource.druid;

//使用新的工具类

import com.jorge.datasource.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test2_Druid {

    public static void main(String[] args) {
        //完成添加的操作给account表添加一条记录
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            //获取连接
            conn = JDBCUtils.getConnection();

            //定义sql
            String sql = "insert into account values (null,?,?)";

            //获取PreparedStatement对象
            ps = conn.prepareStatement(sql);

            //赋值
            ps.setString(1,"王五");
            ps.setDouble(2,2000);

            //执行sql
            int count = ps.executeUpdate();

            if (count > 0) {
                System.out.println("插入成功");
            }else{
                System.out.println("插入失败");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(ps,conn);
        }
    }

}
