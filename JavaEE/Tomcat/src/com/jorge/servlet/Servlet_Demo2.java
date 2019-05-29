package com.jorge.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 *
 */

public class Servlet_Demo2 implements Servlet {

    /**
     * 初始化方法
     * 在Servlet被创建时,只会执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    /**
     * 获取servletConfig对象
     * 每一次Servlet被访问时执行,执行多次
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务的方法
     * 每一次Servlet被访问时,执行,执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");
    }

    /**
     * 获取Servlet的一些信息:版本作者等等
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 在服务器正常关闭时执行,执行一次
     */
    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}