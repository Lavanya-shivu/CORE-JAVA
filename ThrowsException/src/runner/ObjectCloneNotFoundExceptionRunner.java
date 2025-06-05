package runner;

public class ObjectCloneNotFoundExceptionRunner {
    public static void main(String[] args)throws CloneNotSupportedException {
        boolean isCloneSupports = true;

        if(!isCloneSupports){
            throw new CloneNotSupportedException("Error Clone Not Found");
        }
        else {
            System.out.println("Clone Found");
        }
    }
}
