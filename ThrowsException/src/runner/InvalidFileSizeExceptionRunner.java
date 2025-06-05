package runner;

import exception.InvalidFileSizeException;

public class InvalidFileSizeExceptionRunner {
    public static void main(String[] args) throws InvalidFileSizeException{
        boolean isFileSizeValid = true;

        if(!isFileSizeValid){
            throw new InvalidFileSizeException("Error file size is not valid");
        }
        else {
            System.out.println("File size is valid");
        }
    }
}
