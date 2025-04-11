package com.java.runner;

import com.java.external.Airconditioner.RoomHeater;

public class HeaterRunner {
    public static void main(String[] args) {
        RoomHeater heater = new RoomHeater();
        heater.heat();
        System.out.println("--------------------------");

        heater.fanMode();
        heater.turnOff();
        heater.turnOff(heater);
        heater.turnOff(null);
        System.out.println("==========================");
    }
}
