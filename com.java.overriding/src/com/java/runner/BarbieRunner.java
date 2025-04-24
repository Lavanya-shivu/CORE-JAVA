package com.java.runner;

import com.java.external.Airconditioner.FashionBarbie;
import com.java.internal.Barbie;

public class BarbieRunner {
    public static void main(String[] args) {
        Barbie barbie = new Barbie("BTS","NeckChain");
        Barbie barbie1 = new Barbie();
        FashionBarbie fashionBarbie = new FashionBarbie();
        fashionBarbie.style();                  // From Barbie
        System.out.println("--------------------------");

        fashionBarbie.walkRamp();               // Own method
        fashionBarbie.pose();                   // Own method
        fashionBarbie.pose(fashionBarbie);      // With object
        fashionBarbie.pose(null);               // With null
        System.out.println("==========================");
    }
}
