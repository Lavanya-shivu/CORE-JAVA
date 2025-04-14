package com.java.external.Airconditioner;

import com.java.internal.Microwave;

public class Grill {
    public void grill(Microwave microwave) {
        if (microwave != null) {
            System.out.println("Barbie is ready for cooking");

            if (microwave instanceof Baking) {
                Baking baking = (Baking) microwave;
                baking.autoCook();
                baking.stop();
            } else {
                microwave.heat();
                System.err.println("This is a classic Barbie.");
            }
        } else {
            System.err.println("Barbie is not available for photoshoot.");
        }
    }
}
