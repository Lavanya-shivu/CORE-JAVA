package com.java.runner;

import com.java.external.Airconditioner.DigitalCompass;

public class CompassRunner {
    public static void main(String[] args) {
        DigitalCompass digitalCompass = new DigitalCompass();
        digitalCompass.showDirection();     // Base class method
        System.out.println("--------------------------");

        digitalCompass.calibrate();         // Subclass method
        digitalCompass.locate();            // Subclass method
        digitalCompass.locate(digitalCompass); // With object
        digitalCompass.locate(null);        // With null
        System.out.println("==========================");
    }
}
