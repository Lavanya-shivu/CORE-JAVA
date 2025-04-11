package com.java.external.Airconditioner;

import com.java.internal.Candle;

public class ScentedCandle extends Candle {
    public ScentedCandle() {
        System.out.println("No-argument constructor in ScentedCandle");
    }

    public void smell() {
        System.out.println("The scented candle smells like lavender.");
    }

    public void extinguish() {
        System.out.println("Blowing out the scented candle.");
    }

    public void extinguish(Candle candle) {
        if (candle != null) {
            System.out.println("Candle extinguished safely.");
        } else {
            System.out.println("No candle to extinguish.");
        }
    }
}
