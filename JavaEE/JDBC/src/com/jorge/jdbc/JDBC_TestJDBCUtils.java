package com.jorge.jdbc;

import com.jorge.util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_TestJDBCUtils {
    static Connection conn = null;
    static Statement st = null;
    static ResultSet rs = null;

    public static void main(String[] args) {
        try {
            conn = JDBCUtils.getConnection();

            st = conn.createStatement();

            String sql = "select * from student";

            rs = st.executeQuery(sql);

            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + " --- " + name + " --- " + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            JDBCUtils.close(rs,st,conn);
        }
    }
}
