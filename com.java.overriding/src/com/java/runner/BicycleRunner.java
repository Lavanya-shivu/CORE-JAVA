package com.java.runner;

import com.java.external.Airconditioner.GearBicycle;
import com.java.internal.Bicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Gare",4);
        Bicycle bicycle1 = new Bicycle();
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
