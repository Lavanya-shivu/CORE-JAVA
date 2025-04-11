package com.java.external.Airconditioner;

import com.java.internal.Barbie;

public class FashionBarbie extends Barbie {
    public FashionBarbie() {
        System.out.println("No-argument constructor in FashionBarbie");
    }

    public void walkRamp() {
        System.out.println("FashionBarbie walks the runway like a pro!");
    }

    public void pose() {
        System.out.println("FashionBarbie strikes a stunning pose!");
    }

    public void pose(Barbie barbie) {
        if (barbie != null) {
            System.out.println("Barbie poses with confidence.");
        } else {
            System.out.println("No Barbie to pose.");
        }
    }
}
