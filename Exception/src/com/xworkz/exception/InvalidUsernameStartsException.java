package com.xworkz.exception;

public class InvalidUsernameStartsException extends RuntimeException{
    public InvalidUsernameStartsException(String message){
        super(message);
    }
}
