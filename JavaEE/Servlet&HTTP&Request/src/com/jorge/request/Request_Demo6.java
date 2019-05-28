package com.jorge.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * 获取请求体数据:
 *      请求体：只有POST请求方式，才有请求体，在请求体中封装了POST请求的请求参数
            步骤：
                1. 获取流对象
                    BufferedReader getReader()：获取字符输入流，只能操作字符数据
                    ServletInputStream getInputStream()：获取字节输入流，可以操作所有类型数据
                    在文件上传知识点后讲解
                2. 再从流对象中拿数据
 */

@WebServlet("/Request_Demo6")
public class Request_Demo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求消息体
        //1.获取字符流
        BufferedReader br = request.getReader();
        String line = null;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
