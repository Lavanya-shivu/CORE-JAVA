package runner;

import com.xworkz.exception.InvalidCountryException;

public class InvalidCountryExceptionRunner {
    public static void main(String[] args) {
        String country = "";
        if(country!= "India"){
            throw new InvalidCountryException("Error country should be India");
    }
    }
}
