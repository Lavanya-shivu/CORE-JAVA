package com.java.external.Airconditioner;

import com.java.internal.Star;

public class ShootingStar extends Star {
    public ShootingStar() {
        System.out.println("No-argument constructor in ShootingStar");
    }

    public void moveFast() {
        System.out.println("The shooting star moves quickly across the sky.");
    }

    public void disappear() {
        System.out.println("The shooting star disappears into the darkness.");
    }

    public void disappear(Star star) {
        if (star != null) {
            System.out.println("The star has faded away.");
        } else {
            System.out.println("No star to disappear.");
        }
    }
}
