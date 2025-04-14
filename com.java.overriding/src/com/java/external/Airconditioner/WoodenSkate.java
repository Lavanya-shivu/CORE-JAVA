package com.java.external.Airconditioner;

import com.java.internal.Skateboard;

public class WoodenSkate {
    public void woodenSkate(Skateboard skateboard){

        if(skateboard!= null){
            if(skateboard instanceof ElectricSkateboard){
                ElectricSkateboard electricSkateboard = (ElectricSkateboard) skateboard;
                electricSkateboard.charge();
                electricSkateboard.accelerate();
            }
            else {
                skateboard.ride();
                System.err.println("Skateborad is Woodenskate");
            }
        }
        else {
            System.err.println("Skateboead is null");
        }
    }
}
