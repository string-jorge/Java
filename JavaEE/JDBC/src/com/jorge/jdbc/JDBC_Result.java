package com.jorge.jdbc;


import com.jorge.domain.Student;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBC_Result {

    Connection conn = null;
    Statement st = null;
    ResultSet re = null;
    List<Student> list = null;

    public List<Student> findAll() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jorge_jdbc", "root", "19990628");

            st = conn.createStatement();

            String sql = "select * from student";

            re = st.executeQuery(sql);

            Student student = null;
            list = new ArrayList<>();
            while(re.next()) {
                int id = re.getInt("id");
                String name = re.getString("name");
                int age = re.getInt("age");
                Date join_date = re.getDate("join_date");

                student = new Student();

                student.setId(id);
                student.setName(name);
                student.setAge(age);
                student.setJoin_date(join_date);

                list.add(student);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(re != null) {
                try {
                    re.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return list;
    }

    public static void main(String[] args) {
        List<Student> list = new JDBC_Result().findAll();
        System.out.println(list);
    }

}
