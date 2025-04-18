package com.java.runner;

import com.java.external.Airconditioner.WoolenBlanket;
import com.java.internal.Blanket;

public class BlanketRunner {
    public static void main(String[] args) {
        Blanket blanket1 = new Blanket("woolen","L");
        Blanket balanket2 = new Blanket();

        WoolenBlanket blanket = new WoolenBlanket();
        blanket.cover();
        System.out.println("--------------------------");

        blanket.warmth();
        blanket.fold();
        blanket.fold(blanket);
        blanket.fold(null);
        System.out.println("==========================");
    }
}
