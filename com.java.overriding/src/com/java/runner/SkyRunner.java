package com.java.runner;

import com.java.external.Airconditioner.BlueSky;

public class SkyRunner {
    public static void main(String[] args) {
        BlueSky sky = new BlueSky();
        sky.look();                   // Method from base class
        System.out.println("--------------------------");

        sky.cloudType();              // Subclass method
        sky.sunsetTime();             // Subclass method
        sky.sunsetTime(sky);          // With object
        sky.sunsetTime(null);         // With null
        System.out.println("==========================");
    }
}
