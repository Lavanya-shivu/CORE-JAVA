package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit",loadOnStartup = 1)
public class contactServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Contact Form");
        String firstName = servletRequest.getParameter("firstName");
        String lastName = servletRequest.getParameter("lastName");
        String email = servletRequest.getParameter("email");
        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<html><body>");
writer.println("<h1>Thanks for submitting your contact details</h1>");
writer.println("<p>FirstName:" +firstName+ "</p>");
writer.println("<p>LastName:" +lastName+ "</p>");
writer.println("<p>Email:" +email+ "</p>");
writer.println("</body></html>");
    }
}
