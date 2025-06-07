package com.xworkz.slope.runner;

import com.xworkz.slope.dto.SlopeDto;
import com.xworkz.slope.service.SlopeService;
import com.xworkz.slope.service.SlopeServiceImpl;

import java.util.Scanner;

public class SlopeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SlopeService service = new SlopeServiceImpl();

        System.out.println("enter x1");
        double x1 = scanner.nextDouble();

        System.out.println("enter y1");
        double y1 = scanner.nextDouble();

        System.out.println("Enter x2");
        double x2 = scanner.nextDouble();

        System.out.println("enter y2");
        double y2 = scanner.nextDouble();

        SlopeDto slopeDto = new SlopeDto(x1,y1,x2,y2);
        service.calculateSlope(slopeDto);
    }
}
