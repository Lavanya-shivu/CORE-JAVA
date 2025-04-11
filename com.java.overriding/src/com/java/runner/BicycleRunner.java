package com.java.runner;

import com.java.external.Airconditioner.GearBicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        GearBicycle gearBike = new      GearBicycle();
        gearBike.ride();                    // Inherited method
        System.out.println("--------------------------");

        gearBike.changeGear();             // Own method
        gearBike.brake();                  // Own method
        gearBike.brake(gearBike);          // With object
        gearBike.brake(null);              // With null
        System.out.println("==========================");
    }
}
