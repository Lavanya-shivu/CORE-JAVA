package runner;

import com.xworkz.exception.InvalidEmailException;

public class InvalidEmailExceptionRunner {
    public static void main(String[] args) {
        String email = " ";
        if(email.contains("@")){
            throw new InvalidEmailException("Error Email should contain @");
        }
    }
}
