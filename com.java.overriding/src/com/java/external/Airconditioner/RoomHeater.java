package com.java.external.Airconditioner;

import com.java.internal.Heater;

public class RoomHeater extends Heater {
    public RoomHeater() {
        System.out.println("No-argument constructor in RoomHeater");
    }

    public void fanMode() {
        System.out.println("Room heater is in fan mode.");
    }

    public void turnOff() {
        System.out.println("Turning off the room heater.");
    }

    public void turnOff(Heater heater) {
        if (heater != null) {
            System.out.println("Heater turned off safely.");
        } else {
            System.out.println("No heater to turn off.");
        }
    }
}
