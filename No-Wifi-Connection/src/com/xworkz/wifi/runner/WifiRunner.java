package com.xworkz.wifi.runner;

import com.xworkz.wifi.dto.WifiDto;
import com.xworkz.wifi.exception.NoWifiConnectionException;
import com.xworkz.wifi.service.WifiConnectionService;
import com.xworkz.wifi.service.WifiConnectionServiceImpl;

import java.util.Scanner;

public class WifiRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WifiConnectionService wifiConnectionService = new WifiConnectionServiceImpl();

        System.out.println("Enter device name");
        String name = scanner.nextLine();

        System.out.println("Is wifi connected?");
        boolean isConnected  = scanner.nextBoolean();

        WifiDto wifiDto = new WifiDto(isConnected,name);

        try{
            wifiConnectionService.checkConnection(wifiDto);
        }catch (NoWifiConnectionException
                e){
            System.out.println("Error:" +e.getMessage());
        }
    }
}
