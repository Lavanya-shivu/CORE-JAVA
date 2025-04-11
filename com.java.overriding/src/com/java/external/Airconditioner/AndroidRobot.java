package com.java.external.Airconditioner;

import com.java.internal.Robot;

public class AndroidRobot extends Robot {
    public AndroidRobot() {
        System.out.println("No-argument constructor in AndroidRobot");
    }

    public void performTask() {
        System.out.println("Android robot is performing a task.");
    }

    public void shutdown() {
        System.out.println("Shutting down the android robot.");
    }

    public void shutdown(Robot robot) {
        if (robot != null) {
            System.out.println("Robot shut down successfully.");
        } else {
            System.out.println("No robot available to shut down.");
        }
    }
}
