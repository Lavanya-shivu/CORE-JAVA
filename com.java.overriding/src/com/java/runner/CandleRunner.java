package com.java.runner;

import com.java.external.Airconditioner.ScentedCandle;

public class CandleRunner {
    public static void main(String[] args) {
        ScentedCandle candle = new ScentedCandle();
        candle.lightUp();              // Base class method
        System.out.println("--------------------------");

        candle.smell();                // Subclass method
        candle.extinguish();           // Subclass method
        candle.extinguish(candle);     // With object
        candle.extinguish(null);       // With null
        System.out.println("==========================");
    }
}
