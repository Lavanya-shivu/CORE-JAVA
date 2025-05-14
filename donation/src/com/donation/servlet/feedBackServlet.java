package com.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/feedback", loadOnStartup = 1)
public class feedBackServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Provide Your FeedBack");

        String name= servletRequest.getParameter("name");
        String mobile = servletRequest.getParameter("mobile");
        String email = servletRequest.getParameter("email");
        String feedback = servletRequest.getParameter("feedBack");

        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("feedBackSuccess.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);
    }
}
