package com.java.external.Airconditioner;

import com.java.internal.Cracker;

public class CrackerManager {
    public void handle(Cracker cracker) {
        if (cracker != null) {
            System.out.println("Handling the cracker...");

            if (cracker instanceof FireCracker) {
                FireCracker fireCracker = (FireCracker) cracker;
                fireCracker.explode();
                fireCracker.safeDistance();
            } else {
                cracker.light();
                System.out.println("Cracker is lit.");
            }
        } else {
            System.err.println("No cracker to handle.");
        }
    }
}
