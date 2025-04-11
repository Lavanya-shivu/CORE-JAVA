package com.java.external.Airconditioner;

import com.java.internal.Cloud;

public class RainCloud extends Cloud {
    public RainCloud() {
        System.out.println("No-argument constructor in RainCloud.");
    }

    public void releaseRain() {
        System.out.println("Raincloud is releasing rain.");
    }

    public void storm() {
        System.out.println("Storm is forming in the cloud.");
    }

    public void storm(Cloud cloud) {
        if (cloud != null) {
            System.out.println("Storm is approaching the cloud.");
        } else {
            System.out.println("No cloud to form a storm.");
        }
    }
}
