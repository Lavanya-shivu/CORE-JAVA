package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/book")
public class moviebookingservlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Movie ticket booking app");
        String name =servletRequest.getParameter("name");
        String contactnumber = servletRequest.getParameter("contactnumber");
        long c_number=0L;
        if(contactnumber!=null && contactnumber!= ""){
         c_number= Long.parseLong(contactnumber);
        }
        String moviename = servletRequest.getParameter("moviename");
        String ticketprice = servletRequest.getParameter("ticketprice");
        int t_price=0;
        if (ticketprice!= null && ticketprice!= ""){
            t_price = Integer.parseInt(ticketprice);
        }
        String numberoftickets = servletRequest.getParameter("numberoftickets");
        int no_tickets=0;
        if(numberoftickets!= null && numberoftickets!= ""){
            no_tickets = Integer.parseInt(numberoftickets);
        }
        String location = servletRequest.getParameter("location");
        int amount_payable = t_price*no_tickets;
        servletResponse.setContentType("html");
        PrintWriter writer = servletResponse.getWriter();
 writer.println("<h1>Thanks For Booking Tickets</h1>");
 writer.println("<h2>Your Payable Amount!</h2>" + amount_payable);

    }
}
