package com.java.external.Airconditioner;

import com.java.internal.Pen;

public class InkPen extends Pen {
    public InkPen() {
        System.out.println("No-argument constructor in InkPen");
    }

    public void refill() {
        System.out.println("Refilling the ink pen.");
    }

    public void closeCap() {
        System.out.println("Closing the pen cap.");
    }

    public void closeCap(Pen pen) {
        if (pen != null) {
            System.out.println("Pen cap closed.");
        } else {
            System.out.println("No pen to close cap.");
        }
    }
}
