package com.xworkz.servlet;

import Service.LicenseService;
import dto.DonationDto;
import dto.LicenseDto;
import serviceImpl.LicenseServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/license",loadOnStartup = 1)
public class LicenseServlet extends HttpServlet {
 public LicenseServlet(){
     System.out.println("License is running in tomcat");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running servlet in Tomcat");

        String name = req.getParameter("name");
        String contactNumber = req.getParameter("contactNumber");
        String fatherName = req.getParameter("fatherName");
        String adharNumber = req.getParameter("adharNumber");
        String address = req.getParameter("address");

        LicenseDto dto = new LicenseDto();
        dto.setName(name);
        dto.setContactNumber(contactNumber);
        dto.setFatherName(fatherName);
        dto.setAdharNumber(adharNumber);
        dto.setAddress(address);
        req.setAttribute("dto",dto);

        LicenseService licenseService =new LicenseServiceImpl();
        boolean saved= licenseService.save(dto);
        if(saved) {
            RequestDispatcher dispatcher =
                    req.getRequestDispatcher("licenseSuccess.jsp");
//add data to jsp
            req.setAttribute("message", "Save Success");
            req.setAttribute("LicenseDto", dto);
            dispatcher.forward(req,resp);
        }
        else{
            RequestDispatcher dispatcher =
                    req.getRequestDispatcher("license.jsp");
            req.setAttribute("message", "Saving of License Failed");
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("licenseSuccess.jsp");
        requestDispatcher.forward(req, resp);

    }
    }