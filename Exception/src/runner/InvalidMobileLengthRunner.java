package runner;

import com.xworkz.exception.InvalidMobileLengthException;

public class InvalidMobileLengthRunner {
    public static void main(String[] args) {
        String mobileNumber = "";
        if(mobileNumber.length()<10 || mobileNumber.length()>10){
            throw new InvalidMobileLengthException("Error mobile number should be 10 digits");
        }
    }
}
