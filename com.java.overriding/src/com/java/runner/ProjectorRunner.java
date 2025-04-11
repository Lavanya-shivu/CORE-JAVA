package com.java.runner;

import com.java.external.Airconditioner.SmartProjector;

public class ProjectorRunner {
    public static void main(String[] args) {
        SmartProjector projector = new SmartProjector();
        projector.display();              // Inherited method
        System.out.println("--------------------------");

        projector.connectHDMI();          // Subclass method
        projector.powerOff();             // Own method
        projector.powerOff(projector);    // With object
        projector.powerOff(null);         // With null
        System.out.println("==========================");
    }
}
