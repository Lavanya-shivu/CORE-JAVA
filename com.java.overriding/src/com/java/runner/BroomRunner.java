package com.java.runner;

import com.java.external.Airconditioner.ElectricBroom;

public class BroomRunner {
    public static void main(String[] args) {
        ElectricBroom broom = new ElectricBroom();
        broom.sweep();               // Base class method
        System.out.println("--------------------------");

        broom.vacuumMode();          // Subclass method
        broom.cleanDust();           // Subclass method
        broom.cleanDust(broom);      // Method with object
        broom.cleanDust(null);       // Method with null
        System.out.println("==========================");
    }
}
