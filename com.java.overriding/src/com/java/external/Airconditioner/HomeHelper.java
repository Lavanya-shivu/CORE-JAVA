package com.java.external.Airconditioner;

import com.java.internal.Blanket;

public class HomeHelper {
    public void arrange(Blanket blanket) {
        if (blanket != null) {
            System.out.println("Blanket found. Starting arrangement...");

            if (blanket instanceof WoolenBlanket) {
                WoolenBlanket woolen = (WoolenBlanket) blanket;
                woolen.warmth();
                woolen.fold();
            } else {
                blanket.cover();
                System.out.println("Regular blanket arranged.");
            }
        } else {
            System.err.println("No blanket to arrange.");
        }
    }
}
