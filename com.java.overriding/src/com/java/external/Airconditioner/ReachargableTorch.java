package com.java.external.Airconditioner;

import com.java.internal.Torch;

public class ReachargableTorch {
    public void reachargableTorch(Torch torch){
        if(torch!= null){
            if(torch instanceof ElectricTorch){
                ElectricTorch electricTorch = (ElectricTorch) torch;
                electricTorch.batteryStatus();
                electricTorch.beamMode();
            }
            else {
                torch.turnOn();
                System.err.println("Torch is Reachagable");
            }
        }
        else {
            System.err.println("Torch is null");
        }
    }
}
