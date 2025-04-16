package com.java.runner;

import com.java.external.Airconditioner.SpaceAlien;
import com.java.internal.Alien;

public class AlienRunner {
    public static void main(String[] args) {

        Alien alien = new Alien("Jupy",450);
        Alien alien1 = new Alien();

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
