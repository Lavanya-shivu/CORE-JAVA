package com.java.external.Airconditioner;

import com.java.internal.Detergent;

public class LiquidDetergent extends Detergent {
    public LiquidDetergent() {
        System.out.println("No-argument constructor in LiquidDetergent");
    }

    public void fragrance() {
        System.out.println("Adding a fresh fragrance.");
    }

    public void rinse() {
        System.out.println("Rinsing the clothes with liquid detergent.");
    }

    public void rinse(Detergent detergent) {
        if (detergent != null) {
            System.out.println("Clothes rinsed using detergent.");
        } else {
            System.out.println("No detergent provided for rinsing.");
        }
    }
}
