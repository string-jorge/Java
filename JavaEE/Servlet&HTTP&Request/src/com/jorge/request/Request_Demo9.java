package com.jorge.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 2. 请求转发：一种在服务器内部的资源跳转方式
 *      1. 步骤：
 *          1. 通过request对象获取请求转发器对象：RequestDispatcher getRequestDispatcher(String path)
 *          2. 使用RequestDispatcher对象来进行转发：forward(ServletRequest request, ServletResponse response)
 *      2. 特点：
 *          1. 浏览器地址栏路径不发生变化
 *          2. 只能转发到当前服务器内部资源中。
 *          3. 转发是一次请求
 */
@WebServlet("/Request_Demo9")
public class Request_Demo9 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo999被访问了");
        //转发到demo10的资源
        request.getRequestDispatcher("/Request_Demo10").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
