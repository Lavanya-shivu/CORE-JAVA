package com.java.runner;

import com.java.external.Airconditioner.AdvancedLaserGun;

public class LaserGunRunner {
    public static void main(String[] args) {
        AdvancedLaserGun gun = new AdvancedLaserGun();
        gun.shoot();
        System.out.println("--------------------------");

        gun.recharge();
        gun.aim();
        gun.aim(gun);
        gun.aim(null);
        System.out.println("==========================");
    }
}
