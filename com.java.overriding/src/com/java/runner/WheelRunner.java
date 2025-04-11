package com.java.runner;

import com.java.external.Airconditioner.AlloyWheel;

public class WheelRunner {
    public static void main(String[] args) {
        AlloyWheel wheel = new AlloyWheel();
        wheel.rotate();
        System.out.println("--------------------------");

        wheel.grip();
        wheel.stop();
        wheel.stop(wheel);
        wheel.stop(null);
        System.out.println("==========================");
    }
}
