package com.xworkz.temperature.runner;

import com.xworkz.temperature.service.TemperatureService;
import com.xworkz.temperature.service.TemperatureServiceImpl;

import java.util.Scanner;

public class TmperatureRunner {
    public static void main(String[] args) {
        TemperatureService temperatureService = new TemperatureServiceImpl();
       try(Scanner scanner = new Scanner(System.in)){
           System.out.println("Enter the temperature value");
           String input = scanner.nextLine();

           int result = temperatureService.convertToDouble(input);

           if(result!= -1){
               System.out.println("Converted temperature:" +result);
           }else {
               System.out.println("Conversion failed");
           }
           scanner.close();
       }

    }
}
