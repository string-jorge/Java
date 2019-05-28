package com.jorge.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * 获取请求头数据
 *      方法:
 *          1.(*)String get Header(String name):根据请求头的名称获取请求头的值
 *          2.Enumeration<String> get HerderNames():获取所有的请求头名称
 */

@WebServlet("/Request_Demo4")
public class Request_Demo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //请求头数据:user-agent
        String user_agent = request.getHeader("user-agent");

        //判断user_agent的浏览器的版本
        if (user_agent.contains("Chrome")) {
            //谷歌
            System.out.println("谷歌来了");
        }else if (user_agent.contains("Firefox")) {
            //火狐
            System.out.println("火狐来了");
        }
    }
}
