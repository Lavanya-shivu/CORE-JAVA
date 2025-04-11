package com.java.runner;

import com.java.external.Airconditioner.ElectricTorch;

public class TorchRunner {
    public static void main(String[] args) {
        ElectricTorch torch = new ElectricTorch();
        torch.turnOn();                 // Base class method
        System.out.println("--------------------------");

        torch.batteryStatus();         // Subclass method
        torch.beamMode();              // Subclass method
        torch.beamMode(torch);         // With object
        torch.beamMode(null);          // With null
        System.out.println("==========================");
    }
}
