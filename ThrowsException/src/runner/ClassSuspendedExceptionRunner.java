package runner;

import exception.ClassSuspendedException;

public class ClassSuspendedExceptionRunner {
    public static void main(String[] args)throws ClassSuspendedException {
        boolean isClassSuspended = false;

        if(!isClassSuspended){
            throw new ClassSuspendedException("Error class is not suspended");
        }
        else {
            System.out.println("Class is Suspended");
        }
    }
}
