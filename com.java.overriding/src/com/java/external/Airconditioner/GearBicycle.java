package com.java.external.Airconditioner;

import com.java.internal.Bicycle;

public class GearBicycle extends Bicycle {
    public GearBicycle() {
        System.out.println("No-argument constructor in GearBicycle");
    }

    public void changeGear() {
        System.out.println("Changing gears on the bicycle.");
    }

    public void brake() {
        System.out.println("Applying brakes on the bicycle.");
    }

    public void brake(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Brakes are working fine.");
        } else {
            System.out.println("No bicycle to apply brakes.");
        }
    }
}
