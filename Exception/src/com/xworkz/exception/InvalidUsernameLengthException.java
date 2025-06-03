package com.xworkz.exception;

public class InvalidUsernameLengthException extends RuntimeException{
    public InvalidUsernameLengthException(String message){
        super(message);
    }
}
