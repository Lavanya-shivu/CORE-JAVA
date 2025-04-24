package com.java.runner;

import com.java.external.Airconditioner.WaterBottle;
import com.java.internal.Bottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle(4,"Plastic");
        Bottle bottle2 = new Bottle();
        WaterBottle bottle = new WaterBottle();
        bottle.fill();
        System.out.println("--------------------------");

        bottle.openCap();
        bottle.drink();
        bottle.drink(bottle);
        bottle.drink(null);
        System.out.println("==========================");
    }
}
