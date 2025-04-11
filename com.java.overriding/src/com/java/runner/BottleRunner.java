package com.java.runner;

import com.java.external.Airconditioner.WaterBottle;

public class BottleRunner {
    public static void main(String[] args) {
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
