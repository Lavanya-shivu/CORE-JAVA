package com.java.external.Airconditioner;

import com.java.internal.Unicorn;

public class RainbowUnicorn extends Unicorn {
    public RainbowUnicorn() {
        System.out.println("No-argument constructor in RainbowUnicorn");
    }

    public void fly() {
        System.out.println("RainbowUnicorn flies over the rainbow!");
    }

    public void vanish() {
        System.out.println("RainbowUnicorn vanishes into thin air.");
    }

    public void vanish(Unicorn unicorn) {
        if (unicorn != null) {
            System.out.println("The unicorn disappears gracefully.");
        } else {
            System.out.println("No unicorn to vanish.");
        }
    }
}
