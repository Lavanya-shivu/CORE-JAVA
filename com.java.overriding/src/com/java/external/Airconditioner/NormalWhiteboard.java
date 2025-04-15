package com.java.external.Airconditioner;

import com.java.internal.Whiteboard;

public class NormalWhiteboard {
    public void normalWhitboard(Whiteboard whiteboard){
        if(whiteboard!=null){
            if(whiteboard instanceof SmartWhiteboard){
                SmartWhiteboard smartWhiteboard =(SmartWhiteboard) whiteboard;
                smartWhiteboard.connectToWiFi();
                smartWhiteboard.erase();
            }
            else {
                whiteboard.write();
                System.out.println("Whiteboard is Normal board");
            }
        }
        else {
            System.out.println("Whiteboard is null");
        }
    }
}
