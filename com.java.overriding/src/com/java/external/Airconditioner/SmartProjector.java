package com.java.external.Airconditioner;

import com.java.internal.Projector;

public class SmartProjector extends Projector {
    public SmartProjector() {
        System.out.println("No-argument constructor in SmartProjector");
    }

    public void connectHDMI() {
        System.out.println("Connecting to HDMI device.");
    }

    public void powerOff() {
        System.out.println("Projector is shutting down.");
    }

    public void powerOff(Projector projector) {
        if (projector != null) {
            System.out.println("Turning off the projector safely.");
        } else {
            System.out.println("No projector to turn off.");
        }
    }
}
