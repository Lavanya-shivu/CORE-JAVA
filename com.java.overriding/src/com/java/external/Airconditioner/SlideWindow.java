package com.java.external.Airconditioner;

import com.java.internal.Window;

public class SlideWindow {
    public void slideWindow(Window window){
        if(window!=null){
            if(window instanceof SmartWindow){
                SmartWindow smartWindow =(SmartWindow) window;
                smartWindow.close();
                smartWindow.tint();
            }
            else {
                window.open();
                System.out.println("Window is SlideWindow");
            }
        }
        else {
            System.out.println("Window is null");
        }
    }
}
