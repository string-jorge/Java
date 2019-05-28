package com.jorge.download;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取请求参数,文件名称
        String filename = request.getParameter("filename");
        //2.使用字节输入流加载文件进内存
        //2.1找到文件的服务器路径
        ServletContext context = this.getServletContext();
        String realPath = context.getRealPath("/img/" + filename);
        //2.2用字节流关联
        FileInputStream fis = new FileInputStream(realPath);
        //设置response的响应头
        //3.1设置响应头类型:context-type
        String mimeType = context.getMimeType(filename);
        response.setHeader("context-type",mimeType);// img/jpeg
        //3.2置响应头类型:content-disposition
        response.setHeader("content-disposition","attachment;filename=" + filename);//不管是什么文件都打开下载对话框
        //4.将输入流的数据写出到输出流中
        ServletOutputStream sos = response.getOutputStream();
        byte[] buff = new byte[1024 * 8];
        int len = 0;
        while((len = fis.read(buff)) != -1) {
            sos.write(buff,0,len);
        }
        fis.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
