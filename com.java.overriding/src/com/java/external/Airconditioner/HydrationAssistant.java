package com.java.external.Airconditioner;

import com.java.internal.Bottle;

public class HydrationAssistant {
    public void hydrate(Bottle bottle) {
        if (bottle != null) {
            System.out.println("Bottle received. Initiating hydration...");

            if (bottle instanceof WaterBottle) {
                WaterBottle waterBottle = (WaterBottle) bottle;
                waterBottle.openCap();
                waterBottle.drink();
            } else {
                bottle.fill();
                System.out.println("Hydration with a basic bottle.");
            }
        } else {
            System.err.println("No bottle available for hydration.");
        }
    }
}
