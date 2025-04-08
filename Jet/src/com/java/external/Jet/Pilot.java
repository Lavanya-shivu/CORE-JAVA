package com.java.external.Jet;

import com.java.internal.Jet.Jet;

public class Pilot {
    public void jetPilot() {
        Jet jet = new Jet();

        // Only using public getters
        System.out.println("Update Pilot data");
        System.out.println("Model: " + jet.getModel());
        System.out.println("Manufacturer: " + jet.getManufacturer());
        System.out.println("Max Speed: " + jet.getMaxSpeed() + " km/h");
        System.out.println("Range: " + jet.getRange() + " km");
        System.out.println("Is Military: " + jet.isMilitary());
    }
}
