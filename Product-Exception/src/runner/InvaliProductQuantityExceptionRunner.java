package runner;

import com.xwoorkz.product.exception.InvaliProductQuantityException;

public class InvaliProductQuantityExceptionRunner {
    public static void main(String[] args) {
        int quantity = 1500;
        int maxQuantity = 1000;
        if(quantity < 0 ){
            throw new InvaliProductQuantityException("Error product quantity must be greater than 0");
        }
        if(quantity >1000){
            throw new InvaliProductQuantityException("Error product quantity should not be greater than 10000");
        }
    }
}
