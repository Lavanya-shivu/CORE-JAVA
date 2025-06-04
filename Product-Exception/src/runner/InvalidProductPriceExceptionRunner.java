package runner;

import com.xwoorkz.product.exception.InvalidProductPriceException;

public class InvalidProductPriceExceptionRunner {
    public static void main(String[] args) {
double price = 15000;
double maxPrice = 10000;

if(price < 0){
    throw new InvalidProductPriceException("Error Price must be greater than 0");
}
if(price>10000){
    throw new InvalidProductPriceException("Error PRice should not be greater than 10000");
}
    }
}
