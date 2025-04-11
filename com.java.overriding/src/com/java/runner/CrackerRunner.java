package com.java.runner;

import com.java.external.Airconditioner.FireCracker;

public class CrackerRunner {
    public static void main(String[] args) {
        FireCracker fireCracker = new FireCracker();
        fireCracker.light();                  // Method from base class
        System.out.println("--------------------------");

        fireCracker.explode();               // Own method
        fireCracker.safeDistance();          // Own method
        fireCracker.safeDistance(fireCracker); // With object
        fireCracker.safeDistance(null);        // With null
        System.out.println("==========================");
    }
}
