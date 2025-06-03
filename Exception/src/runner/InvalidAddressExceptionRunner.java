package runner;

import com.xworkz.exception.InvalidAddressException;

public class InvalidAddressExceptionRunner {
    public static void main(String[] args) {
        String adrress = "";
        if(adrress == null){
            throw new InvalidAddressException("Error Address should not be null");
        }
    }
}
