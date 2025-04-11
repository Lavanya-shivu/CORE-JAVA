package com.java.runner;

import com.java.external.Airconditioner.Baking;

public class MicrowaveRunner {
    public static void main(String[] args) {
        Baking microwave = new Baking();
        microwave.heat();             // Base class method
        System.out.println("--------------------------");

        microwave.autoCook();         // Subclass method
        microwave.stop();             // Subclass method
        microwave.stop(microwave);    // With object
        microwave.stop(null);         // With null
        System.out.println("==========================");
    }
}
