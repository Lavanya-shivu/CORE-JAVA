package com.java.external.Airconditioner;

import com.java.internal.Rainbow;

public class ColorfulRainbow extends Rainbow {
    public ColorfulRainbow() {
        System.out.println("No-argument constructor in ColorfulRainbow.");
    }

    public void displayColors() {
        System.out.println("Rainbow displays 7 beautiful colors.");
    }

    public void fade() {
        System.out.println("Rainbow is slowly fading.");
    }

    public void fade(Rainbow rainbow) {
        if (rainbow != null) {
            System.out.println("The rainbow fades into the clouds.");
        } else {
            System.out.println("No rainbow to fade.");
        }
    }
}
