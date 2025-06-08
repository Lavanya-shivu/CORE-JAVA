package com.xworkz.lowBattery.service;

import com.xworkz.lowBattery.dto.LowBatteryDto;
import com.xworkz.lowBattery.exception.LowBatteryException;

public class LowBatteryServiceImpl implements LowBatteryService{

    @Override
    public boolean checkBattery(LowBatteryDto lowBatteryDto) throws LowBatteryException {
        if(lowBatteryDto == null){
            throw new NullPointerException("LowBatteryDto is null");
        }
        if(lowBatteryDto.getBatteryLevel()<10){
            throw new LowBatteryException("Battery is low("+lowBatteryDto.getBatteryLevel()+"%");
        }
        System.out.println("Battery Level is fine");
        return true;
    }
}
