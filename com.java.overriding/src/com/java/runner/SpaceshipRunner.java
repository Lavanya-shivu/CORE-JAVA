package com.java.runner;

import com.java.external.Airconditioner.RocketSpaceship;

public class SpaceshipRunner {
    public static void main(String[] args) {
        RocketSpaceship rocket = new RocketSpaceship();
        rocket.launch();                   // From base class
        System.out.println("--------------------------");

        rocket.boost();                    // Own method
        rocket.land();                     // Own method
        rocket.land(rocket);              // With object
        rocket.land(null);                // With null
        System.out.println("==========================");
    }
}
