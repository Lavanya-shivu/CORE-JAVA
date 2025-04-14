package com.java.external.Airconditioner;

import com.java.internal.Mat;

public class DoorMat {
    public void doorMAt(Mat mat) {
        if (mat != null) {
            System.out.println("Mat is ready to use");

            if (mat instanceof YogaMat) {
                YogaMat yogaMat = (YogaMat) mat;
                yogaMat.rollOut();
                yogaMat.clean();
            } else {
                mat.use();
                System.err.println("This is a doormat.");
            }
        } else {
            System.err.println("Mat is null.");
        }
    }
}
