package com.java.external.Airconditioner;
import com.java.internal.Robot;

public class MedicalRobot {
    public void medicalRobot(Robot robot) {
        if (robot != null) {
            if (robot instanceof AndroidRobot) {
                AndroidRobot androidRobot = (AndroidRobot) robot;
                androidRobot.performTask();
                androidRobot.shutdown();
            } else {
                robot.start();
                System.err.println("This is medical robot");
            }
        } else {
            System.err.println("Robot is null");
        }
    }
}
