package runner;

import exception.LoyalRcbFanException;

public class LoyalRcbFanExceptionRunner {
    public static void main(String[] args) throws LoyalRcbFanException{
        boolean isLoyalRcbian = true;

        if(!isLoyalRcbian){
            throw new LoyalRcbFanException("Error CSK fan");
        }
        else {
            System.out.println("RCB fan");
        }
    }
}
