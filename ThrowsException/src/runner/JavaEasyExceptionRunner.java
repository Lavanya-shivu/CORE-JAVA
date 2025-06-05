package runner;

import exception.JavaEasyException;

public class JavaEasyExceptionRunner {
    public static void main(String[] args) throws JavaEasyException{
        boolean isJavaEasy = true;

        if(!isJavaEasy){
            throw new JavaEasyException("Error java is not easy");
        }
        else {
            System.out.println("Java is easy");
        }
    }
}
