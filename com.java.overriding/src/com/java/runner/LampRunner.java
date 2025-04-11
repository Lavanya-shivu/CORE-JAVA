package com.java.runner;

import com.java.external.Airconditioner.TableLamp;

public class LampRunner {
    public static void main(String[] args) {
        TableLamp lamp = new TableLamp();
        lamp.turnOn();              // Base class method
        System.out.println("--------------------------");

        lamp.changeColor();         // Subclass method
        lamp.turnOff();             // Subclass method
        lamp.turnOff(lamp);         // With object
        lamp.turnOff(null);         // With null
        System.out.println("==========================");
    }
}
