package runner;

import exception.RainyException;

public class RainyExceptionRunner {
    public static void main(String[] args) throws RainyException{
        boolean isRainy = true;

        if(!isRainy){
            throw new RainyException("Error it is rainy");
        }
        else {
            System.out.println("IT is not rainy");
        }
    }
}
