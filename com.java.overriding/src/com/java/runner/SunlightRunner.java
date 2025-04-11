package com.java.runner;

import com.java.external.Airconditioner.MorningSunlight;

public class SunlightRunner {
    public static void main(String[] args) {
        MorningSunlight sunlight = new MorningSunlight();
        sunlight.shine();                  // From base class
        System.out.println("--------------------------");

        sunlight.warm();                   // Subclass method
        sunlight.fade();                   // Subclass method
        sunlight.fade(sunlight);          // With object
        sunlight.fade(null);              // With null
        System.out.println("==========================");
    }
}
