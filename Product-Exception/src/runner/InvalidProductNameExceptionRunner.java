package runner;

import com.xwoorkz.product.exception.InvalidProductNameException;
import com.xwoorkz.product.exception.InvalidProductPriceException;

public class InvalidProductNameExceptionRunner {
    public static void main(String[] args) {
        String productName = " ";
        if(productName == null && productName.trim().isEmpty()){
            throw new InvalidProductNameException("Error Product name should not be null or empty");
        }
        if(productName.length()<3){
            throw new InvalidProductPriceException("Error Product name must be atleast 3 characters");
        }
    }
}
