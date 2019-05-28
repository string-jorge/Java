package com.jorge.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * request功能：
        1. 获取请求消息数据
            1. 获取请求行数据
               GET /day14/demo1?name=zhangsan HTTP/1.1
           方法：
                1. 获取请求方式 ：GET
                    String getMethod()

                2.(*)获取虚拟目录：/Request
                    String getContextPath()

                3. 获取Servlet路径: /Request_Demo2
                    String getServletPath()

                4. 获取get方式请求参数：name=zhangsan
                    String getQueryString()

                5. (*)获取请求URI：/Request/Request_Demo2
                    String getRequestURI():		/Request/Request_Demo2
                    StringBuffer getRequestURL()  :/http://localhost:8080/Request/Request_Demo2

                    URL:统一资源定位符 ： http://localhost:8080/Request/Request_Demo2	中华人民共和国
                    URI：统一资源标识符 : /Request/Request_Demo2				        共和国

                6. 获取协议及版本：HTTP/1.1
                    String getProtocol()

                7. 获取客户机的IP地址：0:0:0:0:0:0:0:1
                    String getRemoteAddr()
 */

@WebServlet("/Request_Demo2")
public class Request_Demo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 获取请求方式:GET
        String method = request.getMethod();
        System.out.println(method);

        //2.(*)获取虚拟目录:/Request
        String contextPath = request.getContextPath();
        System.out.println(contextPath);

        //3. 获取Servlet路径:/Request_Demo2
        String servletPath = request.getServletPath();
        System.out.println(servletPath);

        //4. 获取get方式请求参数:name=zhangsan
        String queryString = request.getQueryString();
        System.out.println(queryString);

        //5. (*)获取请求URI:/Request/Request_Demo2
        String requestURI = request.getRequestURI();
        //http://localhost:8080/Request/Request_Demo2
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURI);
        System.out.println(requestURL);

        //6. 获取协议及版本:HTTP/1.1
        String protocol = request.getProtocol();
        System.out.println(protocol);

        //7. 获取客户机的IP地址:0:0:0:0:0:0:0:1
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
