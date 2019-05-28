package com.jorge.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletContext_Demo2")
public class ServletContext_Demo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
                ServletContext的功能
                    1.获取MIME类型
                        * MIME类型:在互联通信过程中定义的一种文件数据类型
                            * 格式:大类型/小类型    text/html    image/jpeg
                        * 获取:String getMimeType(String File)
                    2.域对象:共享数据
                    3.获取文件的真实(服务器)路径
         */
        //1.获取ServletContext
        ServletContext context = this.getServletContext();
        //定义文件名称
        String Filename = "a.jpg";
        //获取MIME类型
        String mimeType = context.getMimeType(Filename);
        System.out.println(mimeType);
        context.setAttribute("msg","haha");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
