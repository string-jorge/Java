package com.jorge.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  Cookie 案例
 */

@WebServlet("/cookieTest")
public class CookieTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //设置响应的消息体的数据格式以及编码
        response.setContentType("text/html;charset=utf-8");

        //1.获取所有的Cookie
        Cookie[] cookies = request.getCookies();
        boolean flag = false;//没有cookie为lastTime
        //2.遍历Cookie数组
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                //3.获取Cookie的名称
                String name = cookie.getName();
                //4.判断名称是否是:lastTime
                if ("lastTime".equals(name)) {
                    //有Cookie,不是第一次访问
                    flag = true;//有lastTime的cookie
                    //设置Cookie的value
                    //设置当前时间的字符串,重新设置Cookie的值,重新发送cookie
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String str_date = sdf.format(date);
                    //URL编码
                    str_date = URLEncoder.encode(str_date,"utf-8");
                    cookie.setValue(str_date);
                    //设置Cookie的存活时间,为一个月
                    cookie.setMaxAge(60 * 60 * 24 * 30);
                    response.addCookie(cookie);
                    //响应数据
                    //获取Cookie的value,时间
                    String value = cookie.getValue();
                    //URL解码
                    value = URLDecoder.decode(value,"utf-8");
                    response.getWriter().write("<h1>欢迎回来,你上次访问时间为:" + value + "</h1>");
                    break;
                }
            }
        }

        if(cookies == null || cookies.length == 0 || flag == false) {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
            String str_date = sdf.format(date);
            //URL编码
            str_date = URLEncoder.encode(str_date,"utf-8");
            Cookie cookie = new Cookie("lastTime",str_date);
            //设置Cookie的存活时间,为一个月
            cookie.setMaxAge(60 * 60 * 24 * 30);
            response.addCookie(cookie);
            response.getWriter().write("<h1>您好,欢迎您首次访问!</h1>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
