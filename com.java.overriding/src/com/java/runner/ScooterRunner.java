package com.java.runner;

import com.java.external.Airconditioner.ElectricScooter;

public class ScooterRunner {
    public static void main(String[] args) {
        ElectricScooter scooter = new ElectricScooter();
        scooter.ride();                     // From base class
        System.out.println("--------------------------");

        scooter.accelerate();              // Own method
        scooter.charge();                  // Own method
        scooter.charge(scooter);           // With object
        scooter.charge(null);              // With null
        System.out.println("==========================");
    }
}
