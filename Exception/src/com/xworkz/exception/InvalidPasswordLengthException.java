package com.xworkz.exception;

public class InvalidPasswordLengthException extends RuntimeException{
    public InvalidPasswordLengthException(String message){
        super(message);
    }
}
