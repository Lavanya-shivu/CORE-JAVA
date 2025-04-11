package com.java.runner;

import com.java.external.Airconditioner.Pilot;

public class HelicopterRunner {
    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        pilot.fly();
        System.out.println("--------------------------");

        pilot.features();
        pilot.navigate();
        pilot.navigate(pilot);  // passing object
        pilot.navigate(null);              // passing null
        System.out.println("==========================");
    }
}
