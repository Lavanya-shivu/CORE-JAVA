package com.java.external.Airconditioner;

import com.java.internal.Sky;

public class BlueSky extends Sky {
    public BlueSky() {
        System.out.println("No-argument constructor in BlueSky.");
    }

    public void cloudType() {
        System.out.println("Sky has cumulus clouds.");
    }

    public void sunsetTime() {
        System.out.println("Sunset occurs around 6:30 PM.");
    }

    public void sunsetTime(Sky sky) {
        if (sky != null) {
            System.out.println("Watching sunset in the sky.");
        } else {
            System.out.println("Sky is not visible for sunset.");
        }
    }
}
