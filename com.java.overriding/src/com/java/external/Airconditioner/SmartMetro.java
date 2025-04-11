package com.java.external.Airconditioner;

import com.java.internal.Metro;

public class SmartMetro extends Metro {
    public SmartMetro() {
        System.out.println("No-argument constructor in SmartMetro");
    }

    public void schedule() {
        System.out.println("Checking metro schedule.");
    }

    public void destination() {
        System.out.println("Reaching the destination on time.");
    }

    public void destination(Metro metro) {
        if (metro != null) {
            System.out.println("Metro arrived at the final station.");
        } else {
            System.out.println("No metro available to reach the destination.");
        }
    }
}

