package com.java.external.Airconditioner;

import com.java.internal.Bottle;

public class WaterBottle extends Bottle {
    public WaterBottle() {
        System.out.println("No-argument constructor in WaterBottle");
    }

    public void openCap() {
        System.out.println("Opening the bottle cap.");
    }

    public void drink() {
        System.out.println("Drinking water from the bottle.");
    }

    public void drink(Bottle bottle) {
        if (bottle != null) {
            System.out.println("Drank from the provided bottle.");
        } else {
            System.out.println("No bottle to drink from.");
        }
    }
}
