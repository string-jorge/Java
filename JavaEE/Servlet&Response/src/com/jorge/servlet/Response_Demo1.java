package com.jorge.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 重定向
 *      特点:资源跳转的方式
 *
 *          * 重定向的特点:redirect
 *              1. 地址栏发生变化
 *              2. 重定向可以访问其他站点(服务器)的资源
 *              3. 重定向是两次请求。不能使用request对象来共享数据
 *          * 转发的特点：forward
 *          1. 转发地址栏路径不变
 *          2. 转发只能访问当前服务器下的资源
 *          3. 转发是一次请求，可以使用request对象来共享数据
 *          forward 和 redirect 区别
 *      路径的写法:
 *          1.路径的分类
 *              1.相对路径:通过相对路径不可以确定唯一资源
 *              2.绝对路径:通过绝对路径可以确定唯一资源
 */

@WebServlet("/response_Demo1")
public class Response_Demo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("demo1");

        //访问/Response_Demo1,会自动跳转/Response_Demo2

        //1.设置状态码为302
        /*response.setStatus(302);

        //2.设置响应头location
        response.setHeader("location","/jorge/response_Demo2");*/

        //简单的重定向方法
        response.sendRedirect("/jorge/response_Demo2");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
