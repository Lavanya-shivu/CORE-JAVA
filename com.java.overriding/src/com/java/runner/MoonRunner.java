package com.java.runner;

import com.java.external.Airconditioner.FullMoon;

public class MoonRunner {
    public static void main(String[] args) {
        FullMoon moon = new FullMoon();
        moon.rise();                  // Base class method
        System.out.println("--------------------------");

        moon.glow();                  // Subclass method
        moon.hide();                  // Subclass method
        moon.hide(moon);             // With object
        moon.hide(null);             // With null
        System.out.println("==========================");
    }
}
