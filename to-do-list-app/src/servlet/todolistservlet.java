package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/list")
public class todolistservlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("To Do List");
        String task = servletRequest.getParameter("task");
        String reminder = servletRequest.getParameter("reminder");
        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();


        writer.println("<h1 style='color:green;'> ✅ Task Added Successfully!</h1>");
        writer.println("<p style='font-size:18px;'><strong>Your Task:</strong> " + task + "</p>");
        if (reminder != null && !reminder.trim().isEmpty()) {
            writer.println("<p class='fs-5 text-info'><strong>Reminder:</strong> " + reminder + "</p>");
        }

        writer.println("<a href='index.html' class='btn btn-primary mt-3'>Go back</a>");
        writer.println("</div>");
    }
}
