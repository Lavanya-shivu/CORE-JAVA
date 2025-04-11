package com.java.external.Airconditioner;

import com.java.internal.Tub;

public class BathTub extends Tub {
    public BathTub() {
        System.out.println("No-argument constructor in Bathtub");
    }

    public void drain() {
        System.out.println("Draining the water from the bathtub.");
    }

    public void clean() {
        System.out.println("Cleaning the bathtub.");
    }

    public void clean(Tub tub) {
        if (tub != null) {
            System.out.println("Bathtub cleaned properly.");
        } else {
            System.out.println("No tub to clean.");
        }
    }
}
