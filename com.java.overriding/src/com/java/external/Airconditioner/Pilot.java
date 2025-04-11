package com.java.external.Airconditioner;

import com.java.internal.Helicopter;

public class Pilot extends Helicopter {
    public Pilot() {
        System.out.println("No-argument constructor in ObjectHelicopter");
    }

    public void features() {
        System.out.println("Helicopter has rotor blades, landing skids, and GPS");
    }

    public void navigate() {
        System.out.println("Navigating the helicopter manually");
    }

    public void navigate(Helicopter helicopter) {
        if (helicopter != null) {
            System.out.println("Helicopter is being remotely navigated");
        } else {
            System.out.println("No helicopter to navigate");
        }
    }
}
