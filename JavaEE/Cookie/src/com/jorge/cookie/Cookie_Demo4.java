package com.jorge.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
        cookie在浏览器中保存的时间
 */

@WebServlet("/cookie_Demo4")
public class Cookie_Demo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建Cookie对象
        Cookie cookie = new Cookie("msg","setMaxAge");
        //设置cookie的存活时间
        //cookie.setMaxAge(30);//将cookie持久化到硬盘,30秒后会自动删除cookie文件
        //cookie.setMaxAge(-1);//默认值
        //cookie.setMaxAge(300);
        cookie.setMaxAge(0);
        //发送Cookie
        response.addCookie(cookie);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
