package com.java.external.Airconditioner;

import com.java.internal.TimeMachine;

public class Future extends TimeMachine {
    public Future() {
        System.out.println("No-argument constructor in FutureTimeMachine");
    }

    public void travel() {
        System.out.println("Traveling through time to the future.");
    }

    public void shutdown() {
        System.out.println("Time machine is shutting down.");
    }

    public void shutdown(TimeMachine machine) {
        if (machine != null) {
            System.out.println("Time machine safely powered off.");
        } else {
            System.out.println("No time machine found to shut down.");
        }
    }
}
