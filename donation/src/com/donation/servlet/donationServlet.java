package com.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet (urlPatterns = "/donate", loadOnStartup = 1)
public class donationServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Donate here");
        String Name =servletRequest.getParameter("name");
        String Contactnumber = servletRequest.getParameter("contactnumber");
        String Email = servletRequest.getParameter("email");
        String Cause = servletRequest.getParameter("cause");
        String Amount = servletRequest.getParameter("amount");

        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("donationSuccess.jsp");

        requestDispatcher.forward(servletRequest, servletResponse);
    }
}
