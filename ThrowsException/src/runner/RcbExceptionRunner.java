package runner;

import exception.RcbException;

public class RcbExceptionRunner {
    public static void main(String[] args) throws RcbException{
        boolean isRcbWon = true;

        if(!isRcbWon){
            throw new RcbException("Error Rcb won the cup");
        }
        else {
            System.out.println("Rcb Won the Cup");
        }
    }
}
