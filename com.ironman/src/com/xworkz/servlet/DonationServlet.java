package com.xworkz.servlet;

import Service.DonationService;
import dto.DonationDto;
import serviceImpl.DonationServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/donate",loadOnStartup = 1)
public class DonationServlet extends HttpServlet {
    public DonationServlet(){
        System.out.println("running donation in tomcat");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running Servlet in Tomcat");

        String name = req.getParameter("name");
        String contactNumber = req.getParameter("contactNumber");
        String email = req.getParameter("email");
        String cause = req.getParameter("cause");
        String amount = req.getParameter("amount");

        DonationDto dto = new DonationDto();
        dto.setName(name);
        dto.setContactNumber(contactNumber);
        dto.setEmail(email);
        dto.setCause(cause);
        dto.setAmount(amount);
        req.setAttribute("dto",dto);

        DonationService donationService = new DonationServiceImpl();
        boolean saved = donationService.save(dto);
        if(saved){
            RequestDispatcher dispatcher = req.getRequestDispatcher("donationSucess.jsp");
            req.setAttribute("message","Save Success");
            req.setAttribute("donationDto",dto);
            dispatcher.forward(req,resp);
        }
        else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("donation.jsp");
            req.setAttribute("message","Saving of Donation Failed");
        }

    }
}
