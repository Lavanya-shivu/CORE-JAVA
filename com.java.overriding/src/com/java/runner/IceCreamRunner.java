package com.java.runner;

import com.java.external.Airconditioner.FlavoredIceCream;

public class IceCreamRunner {
    public static void main(String[] args) {
        FlavoredIceCream iceCream = new FlavoredIceCream();
        iceCream.freeze();                  // From base class
        System.out.println("--------------------------");

        iceCream.scoop();                   // Own method
        iceCream.flavor();                  // Own method
        iceCream.flavor(iceCream);          // With object
        iceCream.flavor(null);              // With null
        System.out.println("==========================");
    }
}
