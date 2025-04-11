package com.java.external.Airconditioner;

import com.java.internal.Skateboard;

public class ElectricSkateboard extends Skateboard {
    public ElectricSkateboard() {
        System.out.println("No-argument constructor in ElectricSkateboard");
    }

    public void accelerate() {
        System.out.println("Electric skateboard is accelerating!");
    }

    public void charge() {
        System.out.println("Charging the electric skateboard.");
    }

    public void charge(Skateboard board) {
        if (board != null) {
            System.out.println("Electric skateboard is fully charged!");
        } else {
            System.out.println("No skateboard to charge.");
        }
    }
}
