package com.jorge.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
        Cookie的快速入门
 */

@WebServlet("/cookie_Demo2")
public class Cookie_Demo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取Cookie
        Cookie[] cs = request.getCookies();
        //获取数据,遍历Cookies
        if (cs != null) {
            for (Cookie c : cs) {
                String name = c.getName();
                String value = c.getValue();
                System.out.println(name + " : " + value);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
