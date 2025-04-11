package com.java.runner;

import com.java.external.Airconditioner.SpaceAlien;

public class AlienRunner {
    public static void main(String[] args) {
        SpaceAlien spaceAlien = new SpaceAlien();
        spaceAlien.communicate(); // From base class
        System.out.println("--------------------------");

        spaceAlien.abduct();      // Own method
        spaceAlien.teleport();    // Own method
        spaceAlien.teleport(spaceAlien); // With object
        spaceAlien.teleport(null);  // With null
        System.out.println("==========================");
    }
}
