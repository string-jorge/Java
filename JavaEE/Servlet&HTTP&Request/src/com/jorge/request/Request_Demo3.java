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
 *          1.(*)String getHeader(String name):根据请求头的名称获取请求头的值
 *          2.Enumeration<String> getHerderNames():获取所有的请求头名称
 */

@WebServlet("/Request_Demo3")
public class Request_Demo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //请求头数据
        Enumeration<String> headerNames = request.getHeaderNames();

        while(headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            //根据请求头的名称获取请求头的值
            String value = request.getHeader(name);

            System.out.println(name + " : " + value);
        }
    }
}
