package com.java.external.Airconditioner;

import com.java.internal.Candle;

public class CandleManager {
    public void manage(Candle candle) {
        if (candle != null) {
            System.out.println("Managing the candle...");

            if (candle instanceof ScentedCandle) {
                ScentedCandle scentedCandle = (ScentedCandle) candle;
                scentedCandle.smell();
                scentedCandle.extinguish();
            } else {
                candle.lightUp();
                System.out.println("Lighting up a regular candle.");
            }
        } else {
            System.err.println("No candle to manage.");
        }
    }
}
