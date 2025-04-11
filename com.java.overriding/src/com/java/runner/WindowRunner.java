package com.java.runner;

import com.java.external.Airconditioner.SmartWindow;

public class WindowRunner {
    public static void main(String[] args) {
        SmartWindow window = new SmartWindow();
        window.open();                 // Base class method
        System.out.println("--------------------------");

        window.tint();                 // Subclass method
        window.close();                // Subclass method
        window.close(window);          // With object
        window.close(null);            // With null
        System.out.println("==========================");
    }
}
