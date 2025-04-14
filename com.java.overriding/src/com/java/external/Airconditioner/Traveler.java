package com.java.external.Airconditioner;

import com.java.internal.Bag;
import com.java.internal.Handbag;

public class Traveler {
    public void prepare(Bag bag) {
        if (bag != null) {
            System.out.println("Bag detected.");

            if (bag instanceof Handbag) {
                Handbag handbag = (Handbag) bag;
                handbag.items();
                handbag.pack();
            } else {
                bag.carry();
                System.out.println("This is a general bag.");
            }
        } else {
            System.err.println("Bag is null.");
        }
    }
}
