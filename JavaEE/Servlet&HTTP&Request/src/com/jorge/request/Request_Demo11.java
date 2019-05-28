package com.jorge.request;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 3. 共享数据：
 *      域对象：一个有作用范围的对象，可以在范围内共享数据
 *          request域：代表一次请求的范围，一般用于请求转发的多个资源中共享数据
 *      方法：
 *          1. void setAttribute(String name,Object obj):存储数据
 *          2. Object getAttitude(String name):通过键获取值
 *          3. void removeAttribute(String name):通过键移除键值对
 * 4. 获取ServletContext：
 *      ServletContext getServletContext()
 */

@WebServlet("/Request_Demo11")
public class Request_Demo11 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //存储到request域中
        request.setAttribute("msg","Hello");

        //转发到demo10资源
        request.getRequestDispatcher("/Request_Demo10").forward(request,response);


        ServletContext servletContext = request.getServletContext();
        System.out.println(servletContext);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
