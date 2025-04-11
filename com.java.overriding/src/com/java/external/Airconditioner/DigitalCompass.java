package com.java.external.Airconditioner;

import com.java.internal.Compass;

public class DigitalCompass extends Compass {
    public DigitalCompass() {
        System.out.println("No-argument constructor in DigitalCompass");
    }

    public void calibrate() {
        System.out.println("Calibrating the digital compass...");
    }

    public void locate() {
        System.out.println("Locating your position via compass.");
    }

    public void locate(Compass compass) {
        if (compass != null) {
            System.out.println("Compass location is accurate.");
        } else {
            System.out.println("Compass not found.");
        }
    }
}
