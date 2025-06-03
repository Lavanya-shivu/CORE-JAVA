package runner;

import com.xworkz.exception.InvalidPasswordLengthException;

public class InvalidPasswordExceptionRunner {
    public static void main(String[] args) {
        String password = "";
        if(password.length()<8 || password.length()>16){
            throw new InvalidPasswordLengthException("Error Password should contain atleast 8 characters");
        }
    }
}
