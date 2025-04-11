package com.java.external.Airconditioner;

import com.java.internal.Alien;

public class SpaceAlien extends Alien {
    public SpaceAlien() {
        System.out.println("No-argument constructor in ExtraterrestrialAlien");
    }

    public void abduct() {
        System.out.println("Alien abducts unsuspecting beings.");
    }

    public void teleport() {
        System.out.println("Alien teleports across the galaxy.");
    }

    public void teleport(Alien alien) {
        if (alien != null) {
            System.out.println("Alien teleports with a partner.");
        } else {
            System.out.println("No alien to teleport with.");
        }
    }
}
