package com.jorge.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 获取请求头数据
 *      方法:
 *          1.(*)String get Header(String name):根据请求头的名称获取请求头的值
 *          2.Enumeration<String> get HerderNames():获取所有的请求头名称
 */

@WebServlet("/Request_Demo5")
public class Request_Demo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //请求头数据:referer
        String referer = request.getHeader("referer");
        System.out.println(referer);

        //防盗链
        if (referer.contains("/Request")) {
            System.out.println("播放电影");
        }else {
            System.out.println("想看电影吗?来优酷吧");
        }
    }
}
