package com.jorge.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/response_Demo3")
public class Response_Demo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取流之前,设置流的默认字符编码
        //response.setCharacterEncoding("utf-8");

        //告诉浏览器,服务器发送的消息体的数据的编码,建议浏览器使用该编码解码
        //response.setHeader("content-type","text/html;charset=utf-8");

        //简单的形式来设置编码
        response.setContentType("text/html;charset=utf-8");

        //1.获取字符输出流,输出数据
        //response.getWriter().write("<h1>Hello Response</h1>");
        //获取中文时乱码
        response.getWriter().write("<h1>你好 Response</h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
