package com.java.external.Airconditioner;

import com.java.internal.Rocket;

public class SpaceRocket extends Rocket {
    public SpaceRocket() {
        System.out.println("No-argument constructor in SpaceRocket");
    }

    public void igniteEngines() {
        System.out.println("Igniting rocket engines.");
    }

    public void orbit() {
        System.out.println("Rocket is now in Earth's orbit.");
    }

    public void orbit(Rocket rocket) {
        if (rocket != null) {
            System.out.println("Rocket reached orbit using the given rocket object.");
        } else {
            System.out.println("No rocket available to orbit.");
        }
    }
}
