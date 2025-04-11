package com.java.runner;

import com.java.external.Airconditioner.SkyLantern;

public class LanternRunner {
    public static void main(String[] args) {
        SkyLantern skyLantern = new SkyLantern();
        skyLantern.glow();                    // From base class
        System.out.println("--------------------------");

        skyLantern.floatUp();                 // Subclass method
        skyLantern.celebrate();               // Subclass method
        skyLantern.celebrate(skyLantern);     // With object
        skyLantern.celebrate(null);           // With null
        System.out.println("==========================");
    }
}
