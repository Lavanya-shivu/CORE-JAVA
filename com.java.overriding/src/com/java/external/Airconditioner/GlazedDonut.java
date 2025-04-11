package com.java.external.Airconditioner;

import com.java.internal.Donut;

public class GlazedDonut extends Donut {
    public GlazedDonut() {
        System.out.println("No-argument constructor in GlazedDonut");
    }

    public void glaze() {
        System.out.println("Adding sugar glaze to the donut!");
    }

    public void fill() {
        System.out.println("Filling donut with custard!");
    }

    public void fill(Donut donut) {
        if (donut != null) {
            System.out.println("Donut is filled and ready to enjoy!");
        } else {
            System.out.println("No donut to fill.");
        }
    }
}
