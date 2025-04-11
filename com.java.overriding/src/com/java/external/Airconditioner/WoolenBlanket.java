package com.java.external.Airconditioner;

import com.java.internal.Blanket;

public class WoolenBlanket extends Blanket {
    public WoolenBlanket() {
        System.out.println("No-argument constructor in WoolenBlanket");
    }

    public void warmth() {
        System.out.println("The woolen blanket provides warmth.");
    }

    public void fold() {
        System.out.println("Folding the woolen blanket.");
    }

    public void fold(Blanket blanket) {
        if (blanket != null) {
            System.out.println("Blanket folded and kept aside.");
        } else {
            System.out.println("No blanket to fold.");
        }
    }
}
