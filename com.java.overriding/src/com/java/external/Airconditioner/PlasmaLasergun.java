package com.java.external.Airconditioner;

import com.java.internal.LaserGun;

public class PlasmaLasergun {
    public void plasmaLasergun(LaserGun laserGun) {
        if (laserGun != null) {
            System.out.println("LaserGun is a gun!");

            if (laserGun instanceof AdvancedLaserGun) {
                AdvancedLaserGun advancedLaserGun = (AdvancedLaserGun) laserGun;
                advancedLaserGun.recharge();
                advancedLaserGun.aim();
            } else {
                laserGun.shoot();
                System.err.println("This is a PlasmaLaser gun.");
            }
        } else {
            System.err.println("Laser gun is null");
        }
    }
}
