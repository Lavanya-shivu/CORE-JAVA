package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/furniture", loadOnStartup = 1)
public class furnitureServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running servlet in tomcat");

        String brand = req.getParameter("brand");
        String size = req.getParameter("size");
        String modelName = req.getParameter("modelName");
        String material = req.getParameter("material");
        String comments = req.getParameter("comments");

        req.setAttribute("message", "Save Success");
        req.setAttribute("brand", brand);
        req.setAttribute("size",size);
        req.setAttribute("modelName",modelName);
        req.setAttribute("material", material);
        req.setAttribute("comments",comments);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("furnitureSuccess.jsp");
        requestDispatcher.forward(req,resp);
    }
}
