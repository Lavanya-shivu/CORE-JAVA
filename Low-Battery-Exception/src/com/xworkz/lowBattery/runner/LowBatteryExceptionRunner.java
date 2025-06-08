package com.xworkz.lowBattery.runner;

import com.xworkz.lowBattery.dto.LowBatteryDto;
import com.xworkz.lowBattery.exception.LowBatteryException;
import com.xworkz.lowBattery.service.LowBatteryService;
import com.xworkz.lowBattery.service.LowBatteryServiceImpl;

import java.util.Scanner;

public class LowBatteryExceptionRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LowBatteryService lowBatteryService = new LowBatteryServiceImpl();
        LowBatteryDto lowBatteryDto = new LowBatteryDto();

        System.out.println("Enter Drone Battery Level %");
        int battery = scanner.nextInt();
        lowBatteryDto.setBatteryLevel(battery);

        try{
            lowBatteryService.checkBattery(lowBatteryDto);
        } catch (LowBatteryException e) {
            System.out.println("Warning" +e.getMessage());
        }
    }
}
