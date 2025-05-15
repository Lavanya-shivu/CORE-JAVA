package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/fir", loadOnStartup = 1)
public class firServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running servlet in Tomcat");

        String name = req.getParameter("name");
        String date = req.getParameter("date");
        String contactNumber = req.getParameter("contactNumber");
        String Reason = req.getParameter("reason");

        req.setAttribute("message"," Save Success");
        req.setAttribute("name",name);
        req.setAttribute("date",date);
        req.setAttribute("contactNumber",contactNumber);
        req.setAttribute("reason",Reason);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("firSuccess.jsp");
        requestDispatcher.forward(req,resp);
    }
}
