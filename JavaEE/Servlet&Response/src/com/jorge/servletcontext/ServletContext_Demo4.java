package com.jorge.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet("/servletContext_Demo4")
public class ServletContext_Demo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
                ServletContext的功能
                    3.获取文件的真实(服务器)路径
                    getRealPath()
         */
        //1.获取ServletContext
        ServletContext context = this.getServletContext();
        //获取文件的真实(服务器)路径
        String realPath1 = context.getRealPath("/b.txt");//web目录下资源访问
        System.out.println(realPath1);
        //File file = new File(realPath1);
        String realPath2 = context.getRealPath("/WEB-INF/c.txt");//WEB-INF目录下的资源访问
        System.out.println(realPath2);
        String realPath3 = context.getRealPath("/WEB-INF/classes/a.txt");//src目录下的资源访问
        System.out.println(realPath3);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
