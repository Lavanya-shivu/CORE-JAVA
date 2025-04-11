package com.java.external.Airconditioner;

import com.java.internal.Microwave;

public class Baking extends Microwave {
    public Baking() {
        System.out.println("No-argument constructor in SmartMicrowave");
    }

    public void autoCook() {
        System.out.println("Using auto-cook feature in smart microwave.");
    }

    public void stop() {
        System.out.println("Stopping the microwave.");
    }

    public void stop(Microwave microwave) {
        if (microwave != null) {
            System.out.println("Microwave stopped safely.");
        } else {
            System.out.println("No microwave to stop.");
        }
    }
}
