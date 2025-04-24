package com.java.runner;

import com.java.external.PdfFileReader;
import com.java.internal.FileReader;
import com.java.internal.TxtFileReader;

public class FileReaderRunner {
    public static void main(String[] args) {
        FileReader fileReader = new TxtFileReader();
        PdfFileReader pdfFileReader = new PdfFileReader(fileReader);
        pdfFileReader.topic();
    }
}
