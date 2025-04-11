package com.java.runner;

import com.java.external.Airconditioner.ShootingStar;

public class StarRunner {
    public static void main(String[] args) {
        ShootingStar star = new ShootingStar();
        star.shine();
        System.out.println("--------------------------");

        star.moveFast();
        star.disappear();
        star.disappear(star);
        star.disappear(null);
        System.out.println("==========================");
    }
}
