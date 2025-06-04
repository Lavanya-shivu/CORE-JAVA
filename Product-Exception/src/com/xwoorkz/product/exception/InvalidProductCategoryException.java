package com.xwoorkz.product.exception;

public class InvalidProductCategoryException extends RuntimeException{
    public InvalidProductCategoryException(String message){
        super(message);
    }
}
