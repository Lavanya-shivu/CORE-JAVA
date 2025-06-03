package runner;

import com.xworkz.exception.InvalidEmailendException;

public class InvalidEmailendExceptionRunner {
    public static void main(String[] args) {
        String emailends = " ";
        if(!emailends.endsWith(".com")){
            throw new InvalidEmailendException("Error Invalid email");
        }
    }
}
