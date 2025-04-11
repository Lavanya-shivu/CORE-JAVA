package com.java.external.Airconditioner;

import com.java.internal.Towel;

public class BathTowel extends Towel {
    public BathTowel() {
        System.out.println("No-argument constructor in BathTowel");
    }

    public void fold() {
        System.out.println("Folding the bath towel neatly.");
    }

    public void hang() {
        System.out.println("Hanging the towel on the rod.");
    }

    public void hang(Towel towel) {
        if (towel != null) {
            System.out.println("Towel is hung properly.");
        } else {
            System.out.println("No towel to hang.");
        }
    }
}
