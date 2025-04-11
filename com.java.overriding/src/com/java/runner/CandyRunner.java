package com.java.runner;

import com.java.external.Airconditioner.CandyFactory;

public class CandyRunner {
    public static void main(String[] args) {
        CandyFactory candyFactory = new CandyFactory();
        candyFactory.make();                   // Inherited from Candy
        System.out.println("--------------------------");

        candyFactory.wrap();                   // Own method
        candyFactory.flavor();                 // Own method
        candyFactory.flavor(candyFactory);     // With object
        candyFactory.flavor(null);             // With null
        System.out.println("==========================");
    }
}
