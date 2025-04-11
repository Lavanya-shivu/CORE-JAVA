package com.java.runner;

import com.java.external.Airconditioner.SmartElevator;

public class ElevatorRunner {
    public static void main(String[] args) {
        SmartElevator elevator = new SmartElevator();
        elevator.move();
        System.out.println("--------------------------");

        elevator.floorSelection();
        elevator.stop();
        elevator.stop(elevator);
        elevator.stop(null);
        System.out.println("==========================");
    }
}
