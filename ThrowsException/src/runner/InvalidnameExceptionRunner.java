package runner;

import java.io.IOException;

public class InvalidnameExceptionRunner {
    public static void main(String[] args) throws IOException{
        boolean isNameValid = true;

        if(!isNameValid){
            throw new IOException("Error name is invalid");
        }
        else{
            System.out.println("Name is valid");
    }
    }
}
