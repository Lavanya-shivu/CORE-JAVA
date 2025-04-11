package com.java.external.Airconditioner;

import com.java.internal.LaserGun;

public class AdvancedLaserGun extends LaserGun {
    public AdvancedLaserGun() {
        System.out.println("No-argument constructor in AdvancedLaserGun");
    }

    public void recharge() {
        System.out.println("Recharging the energy cells.");
    }

    public void aim() {
        System.out.println("Aiming with laser precision.");
    }

    public void aim(LaserGun laserGun) {
        if (laserGun != null) {
            System.out.println("Target locked using the laser gun.");
        } else {
            System.out.println("Cannot aim without a laser gun.");
        }
    }
}
