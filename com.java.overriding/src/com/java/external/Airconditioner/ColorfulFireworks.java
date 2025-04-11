package com.java.external.Airconditioner;

import com.java.internal.Fireworks;

public class ColorfulFireworks extends Fireworks {
    public ColorfulFireworks() {
        System.out.println("No-argument constructor in ColorfulFireworks");
    }

    public void colors() {
        System.out.println("Fireworks display vibrant colors.");
    }

    public void show() {
        System.out.println("Starting the fireworks show.");
    }

    public void show(Fireworks fireworks) {
        if (fireworks != null) {
            System.out.println("Fireworks show was a success!");
        } else {
            System.out.println("No fireworks to show.");
        }
    }
}
