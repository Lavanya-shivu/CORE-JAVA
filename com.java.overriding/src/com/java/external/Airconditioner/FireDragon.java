package com.java.external.Airconditioner;

import com.java.internal.Dragon;

public class FireDragon extends Dragon {
    public FireDragon() {
        System.out.println("No-argument constructor in FireDragon");
    }

    public void breatheFire() {
        System.out.println("The dragon breathes fire fiercely!");
    }

    public void roar() {
        System.out.println("The dragon lets out a thunderous roar.");
    }

    public void roar(Dragon dragon) {
        if (dragon != null) {
            System.out.println("The dragon is roaring majestically.");
        } else {
            System.out.println("There is no dragon to roar.");
        }
    }
}
