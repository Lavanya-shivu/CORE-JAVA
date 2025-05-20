package com.xworkz.servlet;

import Service.LaboratoryService;
import dto.LabDto;
import serviceImpl.LabServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/lab",loadOnStartup = 1)
public class LabServlet extends HttpServlet {
    public LabServlet(){
        System.out.println("Running Laboratory in Tomcat");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running Servlet in Tomcat");

        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String contactNumber= req.getParameter("contactNumber");
        String age = req.getParameter("age");

        LabDto dto = new LabDto();
        dto.setName(name);
        dto.setGender(gender);
        dto.setContactNumber(contactNumber);
        dto.setAge(age);
        req.setAttribute("dto",dto);

        LaboratoryService laboratoryService = new LabServiceImpl();
        boolean saved = laboratoryService.save(dto);
        if(saved){
            RequestDispatcher dispatcher = req.getRequestDispatcher("labSuccess.jsp");
            req.setAttribute("message", "Save Success");
            req.setAttribute("LabDto",dto);
            dispatcher.forward(req,resp);
        }
        else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("laboratory.jsp");
            req.getRequestDispatcher("laboratory.jsp");
            req.setAttribute("message","Saving Laboratory Failed");
        }
    }
}
