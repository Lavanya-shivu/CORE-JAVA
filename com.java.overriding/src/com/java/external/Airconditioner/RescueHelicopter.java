package com.java.external.Airconditioner;

import com.java.internal.Helicopter;

public class RescueHelicopter {
    public void rescueHelicopter(Helicopter helicopter) {
        if (helicopter != null) {
            System.out.println("Helicopter ready to fly!");

            if (helicopter instanceof Pilot) {
                Pilot pilot = (Pilot) helicopter;
                pilot.features();
                pilot.navigate();
            } else {
                helicopter.fly();
                System.err.println("This is a helicopter.");
            }
        } else {
            System.err.println("Helicopter is null.");
        }
    }
}
