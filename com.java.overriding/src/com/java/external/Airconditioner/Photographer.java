package com.java.external.Airconditioner;

import com.java.internal.Barbie;

public class Photographer {
    public void photoshoot(Barbie barbie) {
        if (barbie != null) {
            System.out.println("Barbie is ready for the shoot!");

            if (barbie instanceof FashionBarbie) {
                FashionBarbie fashionBarbie = (FashionBarbie) barbie;
                fashionBarbie.walkRamp();
                fashionBarbie.pose();
            } else {
                barbie.style();
                System.err.println("This is a classic Barbie.");
            }
        } else {
            System.err.println("Barbie is not available for photoshoot.");
        }
    }
}
