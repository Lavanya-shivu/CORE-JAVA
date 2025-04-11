package com.java.external.Airconditioner;

import com.java.internal.Box;

public class ColorBox extends Box {
    public ColorBox() {
        System.out.println("No-argument constructor in ColorBox");
    }

    public void fillColors() {
        System.out.println("Filling the box with different colors.");
    }

    public void close() {
        System.out.println("Closing the color box.");
    }

    public void close(Box box) {
        if (box != null) {
            System.out.println("Box closed and locked.");
        } else {
            System.out.println("No box to close.");
        }
    }
}
