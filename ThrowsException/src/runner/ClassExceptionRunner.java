package runner;

public class ClassExceptionRunner {
    public static void main(String[] args) throws ClassNotFoundException{
        boolean isClassExist = false;

        if(!isClassExist){
            throw new ClassCastException("Error class not found");
        }
        else {
            System.out.println("Class found");
        }
    }
}
