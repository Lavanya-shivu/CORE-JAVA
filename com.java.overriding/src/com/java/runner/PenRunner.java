package com.java.runner;

import com.java.external.Airconditioner.InkPen;

public class PenRunner {
    public static void main(String[] args) {
        InkPen pen = new InkPen();
        pen.write();                 // Base class method
        System.out.println("--------------------------");

        pen.refill();               // Subclass method
        pen.closeCap();             // Subclass method
        pen.closeCap(pen);          // With object
        pen.closeCap(null);         // With null
        System.out.println("==========================");
    }
}
