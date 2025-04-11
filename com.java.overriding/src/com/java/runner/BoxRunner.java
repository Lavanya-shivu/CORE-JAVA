package com.java.runner;

import com.java.external.Airconditioner.ColorBox;

public class BoxRunner {
    public static void main(String[] args) {
        ColorBox colorBox = new ColorBox();
        colorBox.open();             // Base class method
        System.out.println("--------------------------");

        colorBox.fillColors();       // Subclass method
        colorBox.close();            // Subclass method
        colorBox.close(colorBox);    // With object
        colorBox.close(null);        // With null
        System.out.println("==========================");
    }
}
