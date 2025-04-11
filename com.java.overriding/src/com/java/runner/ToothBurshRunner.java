package com.java.runner;

import com.java.external.Airconditioner.ElectricBrush;

public class ToothBurshRunner {
    public static void main(String[] args) {
        ElectricBrush brush = new ElectricBrush();
        brush.clean();
        System.out.println("--------------------------");

        brush.vibrate();
        brush.turnOff();
        brush.turnOff(brush);
        brush.turnOff(null);
        System.out.println("==========================");
    }
}
