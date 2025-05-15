package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/lab",loadOnStartup = 1)
public class labServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running servlet in Tomcat");

        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String mobile = req.getParameter("mobile");
        String age = req.getParameter("age");

        req.setAttribute("message","Save Success");
        req.setAttribute("name",name);
        req.setAttribute("gender",gender);
        req.setAttribute("mobile",mobile);
        req.setAttribute("age",age);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("labSuccesse.jsp");
        requestDispatcher.forward(req,resp);
    }
}
