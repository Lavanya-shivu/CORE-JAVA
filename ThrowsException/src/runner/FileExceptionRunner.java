package runner;

import exception.FileException;

import java.io.FileNotFoundException;

public class FileExceptionRunner {
    public static void main(String[] args) throws FileNotFoundException{
        boolean isFileExist = false;
        if(!isFileExist){
            throw new FileNotFoundException("Error file not found");
        }
        else {
            System.out.println("File Found");
        }
    }
}
