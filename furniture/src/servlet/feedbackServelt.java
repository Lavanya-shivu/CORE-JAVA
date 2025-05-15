package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet (urlPatterns = "/feedback",loadOnStartup = 1)
public class feedbackServelt extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running servlet in TomCat");

        String name = req.getParameter("name");
        String contactNumber = req.getParameter("contactNumber");
        String email = req.getParameter("email");
        String feedBack = req.getParameter("feedBack");

        req.setAttribute("message","Save Success");
        req.setAttribute("name",name);
        req.setAttribute("contactNumber",contactNumber);
        req.setAttribute("email",email);
        req.setAttribute("feedBack",feedBack);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("feedBackSuccess.jsp");
        requestDispatcher.forward(req,resp);
    }
}
