package com.java.external.Airconditioner;

import com.java.internal.Spaceship;

public class RocketSpaceship extends Spaceship {
    public RocketSpaceship() {
        System.out.println("No-argument constructor in RocketSpaceship");
    }

    public void boost() {
        System.out.println("Rocket booster activated!");
    }

    public void land() {
        System.out.println("Spaceship is landing safely.");
    }

    public void land(Spaceship spaceship) {
        if (spaceship != null) {
            System.out.println("Landing procedure initiated for the spaceship.");
        } else {
            System.out.println("No spaceship to land.");
        }
    }
}
