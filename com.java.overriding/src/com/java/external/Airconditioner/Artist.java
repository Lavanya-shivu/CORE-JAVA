package com.java.external.Airconditioner;
import com.java.internal.Box;

public class Artist {
    public void paint(Box box) {
        if (box != null) {
            System.out.println("Working with the box...");

            if (box instanceof ColorBox) {
                ColorBox colorBox = (ColorBox) box;
                colorBox.fillColors();
                colorBox.close();
            } else {
                box.open();
                System.out.println("Using a basic box for storage.");
            }
        } else {
            System.err.println("No box to work with.");
        }
    }
}
