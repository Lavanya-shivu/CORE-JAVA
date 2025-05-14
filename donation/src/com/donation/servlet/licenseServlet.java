package com.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/license", loadOnStartup = 1)
public class licenseServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Fill the License Details");

        String name = servletRequest.getParameter("name");
        String mobile = servletRequest.getParameter("mobile");
        String fatherName = servletRequest.getParameter("fatherName");
        String adhar = servletRequest.getParameter("adhar");
        String address = servletRequest.getParameter("address");

        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("licenseSuccess.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);

    }
}
