package runner;

import com.xworkz.exception.InvalidUsernameLengthException;

public class InvalidUserNameLengthRunner {
    public static void main(String[] args) {
        String userame = "";
        if(userame.length()>3){
            throw new InvalidUsernameLengthException("Error username should be atleast 3 charcaters");
        }
    }
}
