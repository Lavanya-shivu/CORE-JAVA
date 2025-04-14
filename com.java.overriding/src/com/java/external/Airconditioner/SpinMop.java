package com.java.external.Airconditioner;

import com.java.internal.Mop;

public class SpinMop {
    public void spinMop(Mop mop) {
        if (mop != null) {
            if (mop instanceof SprayMop) {
                SprayMop sprayMop = (SprayMop) mop;
                sprayMop.sprayWater();
                sprayMop.cleanSurface();
            } else {
                mop.soak();
                System.err.print("Mop is SpinMop");
            }
        } else {
            System.err.print("Mop is null");
        }
    }
}
