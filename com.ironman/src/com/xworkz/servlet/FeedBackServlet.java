package com.xworkz.servlet;

import Service.FeedBackService;
import dto.FeedBackDto;
import serviceImpl.FeedBackServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedback",loadOnStartup = 1)
public class FeedBackServlet extends HttpServlet {
    public FeedBackServlet(){
        System.out.println("Running FeedBack in Tomcat");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running Servlet in Tomcat");

        String name = req.getParameter("name");
        String contactNumber = req.getParameter("contactNumber");
        String email = req.getParameter("email");
        String feedBack = req.getParameter("feedBack");

        FeedBackDto dto = new FeedBackDto();
        dto.setName(name);
        dto.setContactNumber(contactNumber);
        dto.setEmail(email);
        dto.setFeedBack(feedBack);
        req.setAttribute("dto",dto);

        FeedBackService feedBackService = new FeedBackServiceImpl();
        boolean saved = feedBackService.save(dto);
        if(saved){
            RequestDispatcher dispatcher = req.getRequestDispatcher("feedbackSuccess.jsp");
            req.setAttribute("message","Save Success");
            dispatcher.forward(req,resp);
        }
        else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("feedback.jsp");
            req.setAttribute("message","Saving For FeedBack  Failed");
        }

    }
}
