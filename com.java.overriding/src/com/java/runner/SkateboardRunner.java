package com.java.runner;

import com.java.external.Airconditioner.ElectricSkateboard;

public class SkateboardRunner {
    public static void main(String[] args) {
        ElectricSkateboard board = new ElectricSkateboard();
        board.ride();                   // From base class
        System.out.println("--------------------------");

        board.accelerate();            // Own method
        board.charge();                // Own method
        board.charge(board);           // With object
        board.charge(null);            // With null
        System.out.println("==========================");
    }
}
