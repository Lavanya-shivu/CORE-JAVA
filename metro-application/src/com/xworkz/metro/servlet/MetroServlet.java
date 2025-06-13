package com.xworkz.metro.servlet;

import com.xworkz.metro.dto.MetroDto;
import com.xworkz.metro.repository.MetroRepository;
import com.xworkz.metro.repository.MetroRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/metro",loadOnStartup = 1)
public class MetroServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
              String name = req.getParameter("name");
              String dateAndTime = req.getParameter("dateAndTime");
              String from = req.getParameter("from");
              String to = req.getParameter("to");
              String noOfTickets = req.getParameter("noOfTickets");
              String student = req.getParameter("student");

        MetroDto metroDto = new MetroDto();
        metroDto.setName(name);
        metroDto.setDateAndTime(dateAndTime);
        metroDto.setFrom(from);
        metroDto.setTo(to);
        metroDto.setNoOfTickets(noOfTickets);
        metroDto.setStudent(student);

        MetroRepository metroRepository = new MetroRepositoryImpl();
String book =metroRepository.persist(metroDto);
    }
}
