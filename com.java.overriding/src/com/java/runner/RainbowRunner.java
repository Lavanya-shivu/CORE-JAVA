package com.java.runner;

import com.java.external.Airconditioner.ColorfulRainbow;

public class RainbowRunner {
    public static void main(String[] args) {
        ColorfulRainbow rainbow = new ColorfulRainbow();
        rainbow.appear();                 // From base class
        System.out.println("--------------------------");

        rainbow.displayColors();         // Subclass method
        rainbow.fade();                  // Subclass method
        rainbow.fade(rainbow);           // With object
        rainbow.fade(null);              // With null
        System.out.println("==========================");
    }
}
