package com.jorge.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
        共享问题
            1.同一服务器下的不同项目
                cookie.setPath(String path):设置cookie的取值范围;默认情况下,设置当前的虚拟目录
                    *如果要共享,则可以将path设置为"/"
            2.不同的tomcat服务器cookie的共享
                setDomian(String path):如果设置一级域名相同,那么多个服务器之间cookie可以共享
                    * setDomain(".baidu.com"),那么tieba.baidu.com和news.baidu.com中cookie可以共享
 */

@WebServlet("/cookie_Demo6")
public class Cookie_Demo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建Cookie对象
        //tomcat8以后可以存储中文
        Cookie cookie = new Cookie("msg","你好");
        //设置Path,让当前服务器下部署的所有项目共享Cookie信息
        cookie.setPath("/");
        //发送Cookie
        response.addCookie(cookie);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
