package com.java.runner;
import com.java.external.Airconditioner.Future;
public class TimeMachineRunner {
    public static void main(String[] args) {
        Future machine = new Future();
        machine.activate();            // Base class method
        System.out.println("--------------------------");

        machine.travel();              // Subclass method
        machine.shutdown();            // Subclass method
        machine.shutdown(machine);     // With object
        machine.shutdown(null);        // With null
        System.out.println("==========================");
    }
}
