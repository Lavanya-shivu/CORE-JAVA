package com.java.runner;

import com.java.external.Airconditioner.GlazedDonut;

public class DonutRunner {
    public static void main(String[] args) {
        GlazedDonut donut = new GlazedDonut();
        donut.fry();                    // From base class
        System.out.println("--------------------------");

        donut.glaze();                 // Own method
        donut.fill();                  // Own method
        donut.fill(donut);            // With object
        donut.fill(null);             // With null
        System.out.println("==========================");
    }
}
