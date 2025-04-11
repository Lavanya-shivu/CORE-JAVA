package com.java.external.Airconditioner;

import com.java.internal.Galaxy;

public class MilkyWay extends Galaxy {
    public MilkyWay() {
        System.out.println("No-argument constructor in MilkyWay");
    }

    public void spiralArms() {
        System.out.println("Milky Way has beautiful spiral arms.");
    }

    public void collapse() {
        System.out.println("Galaxy is collapsing into a black hole!");
    }

    public void collapse(Galaxy galaxy) {
        if (galaxy != null) {
            System.out.println("Galaxy collapsed safely into singularity.");
        } else {
            System.out.println("No galaxy to collapse.");
        }
    }
}
