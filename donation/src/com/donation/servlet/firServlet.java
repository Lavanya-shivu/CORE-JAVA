package com.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/fir", loadOnStartup = 1)
public class firServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("File Your FIR");

        String name = servletRequest.getParameter("name");
        String date = servletRequest.getParameter("date");
        String mobile = servletRequest.getParameter("mobile");
        String reason = servletRequest.getParameter("reason");


        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("firSuccess.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);
    }
}
