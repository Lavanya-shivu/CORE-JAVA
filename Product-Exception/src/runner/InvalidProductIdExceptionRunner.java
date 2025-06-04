package runner;

import com.xwoorkz.product.exception.InvalidProductIdException;

public class InvalidProductIdExceptionRunner {
    public static void main(String[] args) {
        int productId = 5;
        if(productId<=0){
            throw new InvalidProductIdException("Error productID must be positive Integers");
        }
    }
}
