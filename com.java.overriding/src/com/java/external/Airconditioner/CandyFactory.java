package com.java.external.Airconditioner;

import com.java.internal.Candy;

public class CandyFactory extends Candy {
    public CandyFactory() {
        System.out.println("No-argument constructor in CandyFactory");
    }

    public void wrap() {
        System.out.println("Wrapping candy in colorful foil!");
    }

    public void flavor() {
        System.out.println("Adding strawberry flavor to the candy!");
    }

    public void flavor(Candy candy) {
        if (candy != null) {
            System.out.println("Candy has a fruity burst of flavor!");
        } else {
            System.out.println("No candy to flavor.");
        }
    }
}
