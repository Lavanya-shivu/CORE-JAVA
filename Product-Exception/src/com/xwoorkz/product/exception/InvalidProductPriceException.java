package com.xwoorkz.product.exception;

public class InvalidProductPriceException extends RuntimeException{
    public InvalidProductPriceException(String message){
        super(message);
    }
}
