package com.java.external.Airconditioner;

import com.java.internal.Dustbin;

public class SmartDustbin extends Dustbin {
    public SmartDustbin() {
        System.out.println("No-argument constructor in SmartDustbin");
    }

    public void detectTrash() {
        System.out.println("Detecting trash using motion sensor.");
    }

    public void compressWaste() {
        System.out.println("Compressing the trash inside the smart dustbin.");
    }

    public void compressWaste(Dustbin dustbin) {
        if (dustbin != null) {
            System.out.println("Trash compressed successfully.");
        } else {
            System.out.println("No dustbin found to compress waste.");
        }
    }
}
