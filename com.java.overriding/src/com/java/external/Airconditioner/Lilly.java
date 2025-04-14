package com.java.external.Airconditioner;

import com.java.internal.FlowerPot;

public class Lilly {
        public void lilly(FlowerPot flowerPot) {
            if (flowerPot != null) {
                flowerPot.flower();
                if (flowerPot instanceof Rose) {
                    FlowerPot flowerPot1 = (FlowerPot)flowerPot;//casting
                    flowerPot1.flower();

                } else {
                    System.err.println("flowerpot not rose");
                }
            } else {
                System.err.println("flowerpot is null..");
            }
        }
    }

