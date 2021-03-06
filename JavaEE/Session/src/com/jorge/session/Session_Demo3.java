package com.jorge.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/session_Demo3")
public class Session_Demo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Session的细节
        //1.获取Session
        HttpSession session = request.getSession();

        System.out.println(session);

        Cookie c = new Cookie("JSESSIONID",session.getId());

        c.setMaxAge(60 * 60);

        response.addCookie(c);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
