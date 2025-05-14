package com.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/lab",loadOnStartup = 1)
public class laboratoryServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Enter Yor Lab details");

        String name = servletRequest.getParameter("name");
        String gender = servletRequest.getParameter("gender");
        String mobile = servletRequest.getParameter("mobile");
        String age = servletRequest.getParameter("age");

        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("laboratory.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);
    }
}
