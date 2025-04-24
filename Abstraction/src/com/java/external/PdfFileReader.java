package com.java.external;

import com.java.internal.FileReader;

public class PdfFileReader {
    private FileReader fileReader;
    public PdfFileReader(FileReader fileReader){
        this.fileReader=fileReader;
    }
    public void topic(){
        if(fileReader!= null){
            System.out.println("running filereader");
            this.fileReader.readFile();
        }
        else {
            System.err.println("filereader error");
        }
    }
}
