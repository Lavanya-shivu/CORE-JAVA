package runner;

import com.xworkz.exception.InvalidAdharNumberException;

public class InvalidAdharNumberExceptionRunner {
    public static void main(String[] args) {
        String adharNumber = "";
        if(adharNumber.length()<12 || adharNumber.length() >12){
           throw new InvalidAdharNumberException("Error Adhar number should be 12 digits");
        }
    }
}
