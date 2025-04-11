package com.java.external.Airconditioner;

import com.java.internal.Lamp;

public class TableLamp extends Lamp {
    public TableLamp() {
        System.out.println("No-argument constructor in SmartLamp");
    }

    public void changeColor() {
        System.out.println("Changing the lamp color to warm white.");
    }

    public void turnOff() {
        System.out.println("Turning off the smart lamp.");
    }

    public void turnOff(Lamp lamp) {
        if (lamp != null) {
            System.out.println("Lamp turned off successfully.");
        } else {
            System.out.println("No lamp to turn off.");
        }
    }
}
