package runner;

import exception.CloneObjectException;

public class CloneObjectExceptionRunner {
    public static void main(String[] args) throws CloneObjectException{
        boolean isCloneExist = true;

        if(!isCloneExist){
            throw new CloneObjectException("Error Clone Not Support");
        }
        else {
            System.out.println("Clone Support");
        }
    }
}
