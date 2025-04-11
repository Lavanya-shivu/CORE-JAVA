package com.java.runner;

import com.java.external.Airconditioner.NatrajaPencil;

public class PencilRunner {
    public static void main(String[] args) {
        NatrajaPencil pencil = new NatrajaPencil();
        pencil.draw();               // Base class method
        System.out.println("--------------------------");

        pencil.click();              // Subclass method
        pencil.hideTip();            // Subclass method
        pencil.hideTip(pencil);      // With object
        pencil.hideTip(null);        // With null
        System.out.println("==========================");
    }
}
