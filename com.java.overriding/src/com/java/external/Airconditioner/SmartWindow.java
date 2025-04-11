package com.java.external.Airconditioner;

import com.java.internal.Window;

public class SmartWindow extends Window {
    public SmartWindow() {
        System.out.println("No-argument constructor in SmartWindow");
    }

    public void tint() {
        System.out.println("Applying automatic tint to the smart window.");
    }

    public void close() {
        System.out.println("Closing the smart window.");
    }

    public void close(Window window) {
        if (window != null) {
            System.out.println("Window is closed securely.");
        } else {
            System.out.println("No window to close.");
        }
    }
}
