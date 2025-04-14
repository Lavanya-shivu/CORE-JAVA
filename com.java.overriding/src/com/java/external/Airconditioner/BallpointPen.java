package com.java.external.Airconditioner;

import com.java.internal.Pen;

public class BallpointPen {
    public void ballpointPen(Pen pen){
        if(pen!= null) {
            if (pen instanceof InkPen) {
                InkPen inkPen = (InkPen) pen;
                inkPen.refill();
                inkPen.closeCap();
                pen.write();
            } else {
                pen.write();
                System.err.print("This is ballpoint ball");
            }
        }else{
            System.err.print("Pen is null");
        }
    }
}
