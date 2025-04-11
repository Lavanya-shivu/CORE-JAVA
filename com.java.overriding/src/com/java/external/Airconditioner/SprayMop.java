package com.java.external.Airconditioner;

import com.java.internal.Mop;

public class SprayMop extends Mop {
    public SprayMop() {
        System.out.println("No-argument constructor in SprayMop");
    }

    public void sprayWater() {
        System.out.println("Spraying water on the floor.");
    }

    public void cleanSurface() {
        System.out.println("Cleaning the floor with spray mop.");
    }

    public void cleanSurface(Mop mop) {
        if (mop != null) {
            System.out.println("Surface cleaned with mop.");
        } else {
            System.out.println("No mop available to clean.");
        }
    }
}
