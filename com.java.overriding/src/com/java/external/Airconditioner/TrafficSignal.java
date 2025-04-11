package com.java.external.Airconditioner;

import com.java.internal.Signal;

public class TrafficSignal extends Signal {
    public TrafficSignal() {
        System.out.println("No-argument constructor in TrafficSignal");
    }

    public void changeColor() {
        System.out.println("Changing traffic signal color.");
    }

    public void stop() {
        System.out.println("Traffic signal turned red - STOP.");
    }

    public void stop(Signal signal) {
        if (signal != null) {
            System.out.println("Signal is red, vehicles are stopped.");
        } else {
            System.out.println("Signal malfunction - proceed with caution.");
        }
    }
}
