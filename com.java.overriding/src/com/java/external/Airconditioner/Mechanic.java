package com.java.external.Airconditioner;

import com.java.internal.Bicycle;

public class Mechanic {
    public void service(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Bicycle received for servicing.");

            if (bicycle instanceof GearBicycle) {
                GearBicycle gearBicycle = (GearBicycle) bicycle;
                gearBicycle.changeGear();
                gearBicycle.brake();
            } else {
                bicycle.ride();
                System.out.println("Basic maintenance completed.");
            }
        } else {
            System.err.println("No bicycle to service.");
        }
    }
}
