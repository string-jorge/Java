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
 * 其他功能
 *      1.获取请求参数通用方法:不论是get还是post方式都可以.使用下列方法获取请求参数
 *          1.String getParameter(String name):根据参数名称获取参数值
 *          2.String[] getParameterValues(String name):根据参数名称获取参数值的数组
 *          3.Enumeration<String> get getParameterNames():获取所有请求的参数名称
 *          4.Map<String,String[]> getParameterMap():获取所有参数的Map键值对集合
 *
 *      3.共享数据
 *
 *      4.获取ServletContext
 */

@WebServlet("/Request_Demo7")
public class Request_Demo7 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //post获取请求参数

        //根据参数名称获取参数值
        String username = request.getParameter("username");
        /*System.out.println("post");
        System.out.println(username);*/

        //根据参数名称获取参数值的数组
        String[] hobbies = request.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }

        //获取所有请求的参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()) {
            String name = parameterNames.nextElement();
            System.out.println(name);
            String value = request.getParameter(name);
            System.out.println(value);
            System.out.println("----------------");
        }
        //获取所有参数的Map键值对集合
        Map<String, String[]> parameterMap = request.getParameterMap();
        //遍历
        Set<String> keySet = parameterMap.keySet();
        for (String name : keySet) {
            //根据键获取值
            String[] values = parameterMap.get(name);
            System.out.println(name);
            for (String value : values) {
                System.out.println(value);
            }
            System.out.println("---------------");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get获取请求参数

        //根据参数名称获取参数值
        /*String username = request.getParameter("username");
        System.out.println("get");
        System.out.println(username);*/
        this.doPost(request,response);
    }
}
