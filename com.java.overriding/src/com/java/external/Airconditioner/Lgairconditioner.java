package com.java.external.Airconditioner;

import com.java.internal.Airconditioner;

public class Lgairconditioner extends Airconditioner {
    public Lgairconditioner() {
        System.out.println("No-argument constructor in ObjectAirconditioner");
    }

    public void features() {
        System.out.println("Airconditioner has remote, turbo mode, and sleep mode");
    }

    public void control() {
        System.out.println("Controlling airconditioner manually");
    }

    public void control(Airconditioner ac) {
        if (ac != null) {
            System.out.println("Airconditioner is being controlled remotely");
        } else {
            System.out.println("No airconditioner to control");
        }
    }
}
