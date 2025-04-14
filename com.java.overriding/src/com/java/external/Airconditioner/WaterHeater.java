package com.java.external.Airconditioner;

import com.java.internal.Heater;

public class WaterHeater {
    public void waterHeater(Heater heater) {
        if (heater != null) {
            System.out.println("Heater is heat!");

            if (heater instanceof RoomHeater) {
                RoomHeater roomHeater = (RoomHeater) heater;
                roomHeater.fanMode();
                roomHeater.turnOff();
            } else {
                heater.heat();
                System.err.println("This is a roomheater.");
            }
        } else {
            System.err.println("Heater is null.");
        }
    }
}
