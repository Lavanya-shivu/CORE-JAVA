package com.java.external.Airconditioner;

import com.java.internal.Glove;

public class LeatherGlove extends Glove {
    public LeatherGlove() {
        System.out.println("No-argument constructor in LeatherGlove");
    }

    public void material() {
        System.out.println("These gloves are made of leather.");
    }

    public void remove() {
        System.out.println("Removing the leather gloves.");
    }

    public void remove(Glove glove) {
        if (glove != null) {
            System.out.println("Gloves removed and stored.");
        } else {
            System.out.println("No gloves to remove.");
        }
    }
}
