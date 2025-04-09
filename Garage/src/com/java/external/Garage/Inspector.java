package com.java.external.Garage;

import com.java.internal.Garage.Garage;

public class Inspector {
    public void inspectGarage() {
        Garage garage = new Garage();

        // Can only use public getters
        System.out.println("Upadte Inspector values");
        System.out.println("Garage Name: " + garage.getName());
        System.out.println("Location: " + garage.getLocation());
        System.out.println("Cars Present: " + garage.getTotalCars());
        System.out.println("Open Status: " + garage.isOpen());
        System.out.println("Service Cost: " + garage.getServiceCost());
    }
}
