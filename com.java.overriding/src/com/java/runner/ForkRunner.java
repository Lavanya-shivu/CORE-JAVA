package com.java.runner;

import com.java.external.Airconditioner.SilverFork;

public class ForkRunner {
    public static void main(String[] args) {
        SilverFork silverFork = new SilverFork();
        silverFork.use();              // Method from base class
        System.out.println("--------------------------");

        silverFork.polish();           // Subclass method
        silverFork.clean();            // Subclass method
        silverFork.clean(silverFork);  // Overloaded method with object
        silverFork.clean(null);        // Overloaded method with null
        System.out.println("==========================");
    }
}
