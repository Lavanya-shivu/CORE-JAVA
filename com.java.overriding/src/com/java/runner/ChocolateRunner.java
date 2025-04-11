package com.java.runner;

import com.java.external.Airconditioner.DarkChocolate;

public class ChocolateRunner {
    public static void main(String[] args) {
        DarkChocolate dark = new DarkChocolate();
        dark.taste();                    // Inherited from Chocolate
        System.out.println("--------------------------");

        dark.melt();                     // Own method
        dark.bitterNote();               // Own method
        dark.bitterNote(dark);           // With object
        dark.bitterNote(null);           // With null
        System.out.println("==========================");
    }
}
