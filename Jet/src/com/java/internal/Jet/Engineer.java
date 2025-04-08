package com.java.internal.Jet;

public class Engineer {
    public void jetEngineer() {
        Jet jet = new Jet();

        // Using setters
        jet.setModel("Sukhoi Su-57");
        jet.setManufacturer("Sukhoi");
        jet.setMaxSpeed(2600);
        jet.setRange(3500);
        jet.setIsMilitary(true);

        // Using getters
        System.out.println("Update Jet data");
        System.out.println("Model: " + jet.getModel());
        System.out.println("Manufacturer: " + jet.getManufacturer());
        System.out.println("Max Speed: " + jet.getMaxSpeed() + " km/h");
        System.out.println("Range: " + jet.getRange() + " km");
        System.out.println("Is Military: " + jet.isMilitary());
    }
}
