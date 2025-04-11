package com.java.external.Airconditioner;

import com.java.internal.Cracker;

public class FireCracker extends Cracker {
    public FireCracker() {
        System.out.println("No-argument constructor in FireCracker");
    }

    public void explode() {
        System.out.println("Boom! Firecracker exploded.");
    }

    public void safeDistance() {
        System.out.println("Maintain a safe distance from firecrackers.");
    }

    public void safeDistance(Cracker cracker) {
        if (cracker != null) {
            System.out.println("Safety measures applied.");
        } else {
            System.out.println("No cracker to handle.");
        }
    }
}
