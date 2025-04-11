package com.java.runner;

import com.java.external.Airconditioner.AndroidRobot;

public class RobotRunner {
    public static void main(String[] args) {
        AndroidRobot robot = new AndroidRobot();
        robot.start();                  // Base class method
        System.out.println("--------------------------");

        robot.performTask();            // Subclass method
        robot.shutdown();               // Subclass method
        robot.shutdown(robot);          // With object
        robot.shutdown(null);           // With null
        System.out.println("==========================");
    }
}
