package runner;

import java.text.ParseException;

public class DateParseExceptionRunner {
    public static void main(String[] args)throws ParseException {
        boolean isDateInvalid = true;

        if(isDateInvalid){
            throw new ParseException("Error Date is invalid",0);
        }
        else {
            System.out.println("Date is valid");
        }
    }
}
