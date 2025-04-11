package com.java.external.Airconditioner;

import com.java.internal.Scooter;

public class ElectricScooter extends Scooter {
    public ElectricScooter() {
        System.out.println("No-argument constructor in ElectricScooter");
    }

    public void accelerate() {
        System.out.println("Electric scooter is accelerating smoothly!");
    }

    public void charge() {
        System.out.println("Charging the electric scooter.");
    }

    public void charge(Scooter scooter) {
        if (scooter != null) {
            System.out.println("Scooter is fully charged and ready!");
        } else {
            System.out.println("No scooter to charge.");
        }
    }
}
