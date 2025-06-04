package runner;

import com.xwoorkz.product.exception.InvalidProductCategoryException;

public class InvalidProductCategoryExceptionRunner {
    public static void main(String[] args) {
String category = "";
if(!category.equalsIgnoreCase("electronics")&& !category.equalsIgnoreCase("clothing")&& !category.equalsIgnoreCase("books")&& !category.equalsIgnoreCase("home")){
    throw new InvalidProductCategoryException("Error category must be in electronics, clothing, books or home");
        }
    }
}
