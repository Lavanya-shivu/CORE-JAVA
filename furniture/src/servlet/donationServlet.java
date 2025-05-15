package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/donate",loadOnStartup = 1)
public class donationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running servlet from tomcat");

        String name = req.getParameter("name");
        String contactnumber = req.getParameter("contactnumber");
        String email = req.getParameter("email");
        String cause = req.getParameter("cause");
        String amount =req.getParameter("amount");

        req.setAttribute("message","Save Success");
        req.setAttribute("name",name);
        req.setAttribute("contactnumber",contactnumber);
        req.setAttribute("email",email);
        req.setAttribute("cause",cause);
        req.setAttribute("amount",amount);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("dontionSuccess.jsp");
        requestDispatcher.forward(req,resp);
    }
}
