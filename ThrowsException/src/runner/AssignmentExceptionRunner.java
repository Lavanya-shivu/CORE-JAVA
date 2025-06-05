package runner;

import exception.AssignmentException;

public class AssignmentExceptionRunner {
    public static void main(String[] args) throws AssignmentException {
boolean isassignmentCompleted = false;
if(!isassignmentCompleted){
    throw new AssignmentException("Error Assignment not completed");
        }
else{
        System.out.println("Assignment Completed");
        }
    }
}
