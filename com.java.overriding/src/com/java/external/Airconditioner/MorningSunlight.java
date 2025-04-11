package com.java.external.Airconditioner;

import com.java.internal.Sunlight;

public class MorningSunlight extends Sunlight {
    public MorningSunlight() {
        System.out.println("No-argument constructor in MorningSunlight.");
    }

    public void warm() {
        System.out.println("Morning sunlight is warm and gentle.");
    }

    public void fade() {
        System.out.println("Sunlight is fading as evening comes.");
    }

    public void fade(Sunlight sunlight) {
        if (sunlight != null) {
            System.out.println("Sunlight fades behind the clouds.");
        } else {
            System.out.println("No sunlight to fade.");
        }
    }
}
