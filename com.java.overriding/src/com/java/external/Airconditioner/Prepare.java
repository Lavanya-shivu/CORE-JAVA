package com.java.external.Airconditioner;

import com.java.internal.Donut;

public class Prepare {
    public void prepareDonut(Donut donut) {
        if (donut != null) {
            donut.fry();  // Frying the donut

            // Check if the donut is an instance of GlazedDonut (subclass)
            if (donut instanceof GlazedDonut) {
                GlazedDonut glazedDonut = (GlazedDonut) donut;  // Casting to GlazedDonut class
                glazedDonut.glaze();                            // Adding glaze to the donut
            } else {
                System.err.println("Donut is not glazed.");
            }
        } else {
            System.err.println("Donut is null.");
        }
    }
}
