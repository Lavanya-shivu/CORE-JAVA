package com.java.external.Airconditioner;

import com.java.internal.Wheel;

public class WoodenWheel {
    public void woodenWheel(Wheel wheel){
        if(wheel!=null){
            if(wheel instanceof AlloyWheel){
                AlloyWheel alloyWheel =(AlloyWheel) wheel;
                alloyWheel.grip();
                alloyWheel.stop();
            }
            else {
                wheel.rotate();
                System.out.println("Wheel is wooden Wheel");
            }
        }
        else {
            System.out.println("Wheel is null");
        }
    }
}
