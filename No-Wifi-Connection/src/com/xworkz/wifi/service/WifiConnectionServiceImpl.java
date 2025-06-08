package com.xworkz.wifi.service;

import com.xworkz.wifi.dto.WifiDto;
import com.xworkz.wifi.exception.NoWifiConnectionException;

public class WifiConnectionServiceImpl implements WifiConnectionService{

    @Override
    public boolean checkConnection(WifiDto wifiDto) throws NoWifiConnectionException {
        if(wifiDto == null){
            throw new NullPointerException("WifiDto is null");
        }
        if(!wifiDto.isWifiConnection()){
            throw new NoWifiConnectionException("No wifi connection for Device"+wifiDto.getDeviceName());
        }
        System.out.println("Device" +wifiDto.getDeviceName()+"is connected to wifi");
        return true;
    }
}

