package com.java.runner;

import com.java.external.Airconditioner.SmartWhiteboard;

public class WhiteboardRunner {
    public static void main(String[] args) {
        SmartWhiteboard smartBoard = new SmartWhiteboard();
        smartBoard.write();                  // Inherited method
        System.out.println("--------------------------");

        smartBoard.connectToWiFi();          // Subclass method
        smartBoard.erase();                  // Subclass method
        smartBoard.erase(smartBoard);        // Overloaded method with object
        smartBoard.erase(null);              // Overloaded method with null
        System.out.println("==========================");
    }
}
