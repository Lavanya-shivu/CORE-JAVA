package com.java.external.Airconditioner;

import com.java.internal.Scarf;

public class SilkScarf extends Scarf {
    public SilkScarf() {
        System.out.println("No-argument constructor in SilkScarf");
    }

    public void style() {
        System.out.println("Silk scarf adds style to the outfit.");
    }

    public void fold() {
        System.out.println("Folding the silk scarf.");
    }

    public void fold(Scarf scarf) {
        if (scarf != null) {
            System.out.println("Scarf folded neatly.");
        } else {
            System.out.println("No scarf to fold.");
        }
    }
}
