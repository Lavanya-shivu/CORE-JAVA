package com.java.external.Airconditioner;

import com.java.internal.Projector;

public class StandardProjector {
    public void standardProjector(Projector projector){
        if(projector!= null){
            if(projector instanceof SmartProjector){
                SmartProjector smartProjector = (SmartProjector) projector;
                smartProjector.connectHDMI();
                smartProjector.powerOff();
            }
            else{
                projector.display();
                System.err.println("This is standard projector");
            }
        }
        else{
            System.err.println("Projector is null");
        }
    }
}
