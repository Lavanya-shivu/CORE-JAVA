package com.xworkz.servlet;

import dto.FirDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/fir",loadOnStartup = 1)
public class FirServlet extends HttpServlet {
    public FirServlet(){
        System.out.println("running fir in tomcat");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running servlet in Tomcat");
        String name = req.getParameter("name");
        String date = req.getParameter("date");
        String contactNumber = req.getParameter("contactNumber");
        String reason = req.getParameter("reason");

        FirDto dto = new FirDto();
        dto.setName(name);
        dto.setDate(date);
        dto.setContactNumber(contactNumber);
        dto.setReason(reason);
        req.setAttribute("dto",dto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("firSuccess.jsp");
        requestDispatcher.forward(req,resp);
    }
}
