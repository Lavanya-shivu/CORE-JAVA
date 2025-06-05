package runner;

public class InvalidThreadExceptionRunner {
    public static void main(String[] args) throws InterruptedException{
        boolean isThreadIntrupped = false;

        if(isThreadIntrupped){
            throw new InterruptedException("Error thread is interrupted");
        }
        else {
            System.out.println("Thread id not interrupted");
        }
    }
}
