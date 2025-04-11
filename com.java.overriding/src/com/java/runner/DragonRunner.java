package com.java.runner;

import com.java.external.Airconditioner.FireDragon;

public class DragonRunner {
    public static void main(String[] args) {
        FireDragon dragon = new FireDragon();
        dragon.fly();                      // From base class
        System.out.println("--------------------------");

        dragon.breatheFire();              // Own method
        dragon.roar();                     // Own method
        dragon.roar(dragon);              // With object
        dragon.roar(null);                // With null
        System.out.println("==========================");
    }
}
