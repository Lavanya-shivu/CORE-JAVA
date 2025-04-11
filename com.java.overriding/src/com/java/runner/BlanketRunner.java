package com.java.runner;

import com.java.external.Airconditioner.WoolenBlanket;

public class BlanketRunner {
    public static void main(String[] args) {
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
