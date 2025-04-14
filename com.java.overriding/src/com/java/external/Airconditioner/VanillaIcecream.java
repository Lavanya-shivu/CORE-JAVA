package com.java.external.Airconditioner;

import com.java.internal.Barbie;
import com.java.internal.IceCream;

public class VanillaIcecream {
    public void vanillaIcecream(IceCream iceCream) {
        if (iceCream != null) {
            System.out.println("Icecream is cool!");

            if (iceCream instanceof FlavoredIceCream) {
                FlavoredIceCream flavoredIceCream = (FlavoredIceCream) iceCream;
                flavoredIceCream.scoop();
                flavoredIceCream.flavor();
            } else {
                iceCream.freeze();
                System.err.println("This is a flavored icecream.");
            }
        } else {
            System.err.println("Icecream is null.");
        }
    }
}
