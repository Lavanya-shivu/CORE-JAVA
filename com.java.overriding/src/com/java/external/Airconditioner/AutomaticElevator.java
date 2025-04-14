package com.java.external.Airconditioner;

import com.java.internal.Elevator;

public class AutomaticElevator {
    public void automaticElevator(Elevator elevator) {
        if (elevator != null) {
            elevator.move();

            if (elevator instanceof SmartElevator) {
                SmartElevator smartElevator = (SmartElevator) elevator;
                smartElevator.floorSelection();
                smartElevator.stop();
            } else {
                System.err.println("This is not a smart elevator.");
            }
        } else {
            System.err.println("No elevator to handle.");
        }
    }
}
