package com.java.runner;

import com.java.external.Airconditioner.RainbowUnicorn;

public class UnicornRunner {
    public static void main(String[] args) {
        RainbowUnicorn rainbowUnicorn = new RainbowUnicorn();
        rainbowUnicorn.sparkle();                // From Unicorn
        System.out.println("--------------------------");

        rainbowUnicorn.fly();                    // Subclass method
        rainbowUnicorn.vanish();                 // Subclass method
        rainbowUnicorn.vanish(rainbowUnicorn);   // Pass object
        rainbowUnicorn.vanish(null);             // Null check
        System.out.println("==========================");
    }
}
