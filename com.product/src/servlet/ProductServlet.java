package servlet;

import dto.ProductDto;
import repository.ProductRepository;
import repositoryImpl.ProductRepositoryImpl;
import service.ProductService;
import serviceImpl.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/product",loadOnStartup = 1)
public class ProductServlet extends HttpServlet {
public ProductServlet(){
    System.out.println("Running Product in Tomcat");
}
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running Servlet in Tomcat");

        String name =req.getParameter("name");
        String type = req.getParameter("type");
        String incomingPrice = req.getParameter("incomingPrice");
        String sellingPrice = req.getParameter("sellingPrice");
        String mrp = req.getParameter("mrp");
        String description = req.getParameter("description");
        String brand = req.getParameter("brand");
        String quantity = req.getParameter("quantity");
        String color = req.getParameter("color");
        String weight = req.getParameter("weight");
        String manfDate = req.getParameter("manfDate");
        String warranty = req.getParameter("warranty");
        String returnPolicy = req.getParameter("returnPolicy");

        ProductDto productDto = new ProductDto();
        productDto.setName(name);
        productDto.setType(type);
        productDto.setIncomingPrice(incomingPrice);
        productDto.setSellingPrice(sellingPrice);
        productDto.setMrp(mrp);
        productDto.setDescription(description);
        productDto.setBrand(brand);
        productDto.setQuantity(quantity);
        productDto.setColor(color);
        productDto.setWeight(weight);
        productDto.setManfDate(manfDate);
        productDto.setWarranty(warranty);
        productDto.setReturnPolicy(returnPolicy);

ProductService productService = new ProductServiceImpl();
boolean saved =productService.save(productDto);

if (saved){
req.setAttribute("message","Save Success");
req.setAttribute("ProductDto",productDto);
    RequestDispatcher dispatcher = req.getRequestDispatcher("productSuccess.jsp");
dispatcher.forward(req,resp);
}
else {
req.getRequestDispatcher("product.jsp");
req.setAttribute("message","Saving Product Failed");
    RequestDispatcher dispatcher = req.getRequestDispatcher("product.jsp");
dispatcher.forward(req,resp);
}
    }
}
