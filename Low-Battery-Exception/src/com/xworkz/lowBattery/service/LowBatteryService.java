package com.xworkz.lowBattery.service;

import com.xworkz.lowBattery.dto.LowBatteryDto;
import com.xworkz.lowBattery.exception.LowBatteryException;

public interface LowBatteryService {
    boolean checkBattery(LowBatteryDto lowBatteryDto) throws LowBatteryException;

}
