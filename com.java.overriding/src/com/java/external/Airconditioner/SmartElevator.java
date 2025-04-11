package com.java.external.Airconditioner;

import com.java.internal.Elevator;

public class SmartElevator extends Elevator {
    public SmartElevator() {
        System.out.println("No-argument constructor in SmartElevator");
    }

    public void floorSelection() {
        System.out.println("Selecting the desired floor.");
    }

    public void stop() {
        System.out.println("Elevator is stopping.");
    }

    public void stop(Elevator elevator) {
        if (elevator != null) {
            System.out.println("Elevator has stopped safely.");
        } else {
            System.out.println("No elevator to stop.");
        }
    }
}
