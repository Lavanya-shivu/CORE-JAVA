package com.java.external.Airconditioner;

import com.java.internal.Pencil;

public class NatrajaPencil extends Pencil {
    public NatrajaPencil() {
        System.out.println("No-argument constructor in MechanicalPencil");
    }

    public void click() {
        System.out.println("Clicking the mechanical pencil to release lead.");
    }

    public void hideTip() {
        System.out.println("Hiding the pencil tip.");
    }

    public void hideTip(Pencil pencil) {
        if (pencil != null) {
            System.out.println("Pencil tip hidden safely.");
        } else {
            System.out.println("No pencil to hide tip.");
        }
    }
}
