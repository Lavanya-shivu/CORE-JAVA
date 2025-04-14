package com.java.external.Airconditioner;

import com.java.internal.Detergent;

public class DetergentManager {
    public void handle(Detergent detergent) {
        if (detergent != null) {
            System.out.println("Handling detergent...");

            if (detergent instanceof LiquidDetergent) {
                LiquidDetergent liquid = (LiquidDetergent) detergent;
                liquid.fragrance();
                liquid.rinse();
            } else {
                detergent.foam();
                System.out.println("Basic detergent cleaning process.");
            }
        } else {
            System.out.println("No detergent available.");
        }
    }
}
