package runner;

import exception.SunnyException;

public class SunnyExceptionRunner {
    public static void main(String[] args) throws SunnyException{
        boolean isSunny = true;

        if(!isSunny){
           throw new SunnyException("Error it is Sunny");
        }
        else {
            System.out.println("It is not sunny");
        }
    }
}
