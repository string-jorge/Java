package com.jorge.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * 中文乱码
 *      * get方式:Tomcat8已经将get方式乱码问题解决了
 *      * post方式:会乱码
 *          * 解决方式:在获取参数前,设置request的编码
 *          request.setCharacterEncoding("utf_8");
 */

@WebServlet("/Request_Demo8")
public class Request_Demo8 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.设置流的编码
        request.setCharacterEncoding("utf-8");

        //获取请求参数username
        String username = request.getParameter("username");
        System.out.println(username);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get获取请求参数
        this.doPost(request,response);
    }
}
