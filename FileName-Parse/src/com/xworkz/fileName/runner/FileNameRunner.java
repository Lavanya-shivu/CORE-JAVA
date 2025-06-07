package com.xworkz.fileName.runner;

import com.xworkz.fileName.dto.FileNameDto;
import com.xworkz.fileName.service.FileNameService;
import com.xworkz.fileName.service.FileNameServiceImpl;

import java.util.Scanner;

public class FileNameRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileNameService fileNameService = new FileNameServiceImpl();

        System.out.println("Enter a File Name");
        String input  = scanner.nextLine();

        FileNameDto fileNameDto = new FileNameDto(input);
        fileNameService.extractExtension(fileNameDto);
    }
}
