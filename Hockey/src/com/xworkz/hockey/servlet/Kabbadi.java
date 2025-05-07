package com.xworkz.hockey.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/send" , loadOnStartup = 1)
public class Kabbadi extends GenericServlet {
    public Kabbadi()
    {
        System.out.println("Running Kabbadi in Tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running Kabbadi");
    }
}
