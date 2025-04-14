package com.java.external.Airconditioner;

import com.java.internal.ToothBrush;

public class OralbBrush {
    public void oralbBrush(ToothBrush toothBrush){
        if(toothBrush!= null){
            if(toothBrush instanceof ElectricBrush){
                ElectricBrush electricBrush = (ElectricBrush) toothBrush;
                electricBrush.turnOff();
                electricBrush.vibrate();
            }
            else {
                toothBrush.clean();
                System.err.println("ToorthBrush is oralb");
            }
        }
        else {
            System.err.println("ToothBrush is null");
        }
    }
}
