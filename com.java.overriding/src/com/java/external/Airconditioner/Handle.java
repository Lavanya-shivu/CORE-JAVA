package com.java.external.Airconditioner;

import com.java.internal.Dragon;

public class Handle {
    public void handleDragon(Dragon dragon) {
        if (dragon != null) {
            dragon.fly();  // Calling the fly() method from Dragon

            // Check if the dragon is an instance of FireDragon
            if (dragon instanceof FireDragon) {
                FireDragon fireDragon = (FireDragon) dragon;  // Casting to FireDragon class
                fireDragon.breatheFire();                     // Breathing fire specific to FireDragon
            } else {
                System.err.println("This dragon does not breathe fire.");
            }
        } else {
            System.err.println("No dragon to handle.");
        }
    }
}
