package com.xworkz.action.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.xml.soap.SOAPPart;
import java.io.IOException;
@WebServlet(urlPatterns = "/send", loadOnStartup = 1)
public class loli extends GenericServlet {
public loli()
{
    System.out.println("Application Running succesfully");
}

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
System.out.println("Running Code");
    }
}
