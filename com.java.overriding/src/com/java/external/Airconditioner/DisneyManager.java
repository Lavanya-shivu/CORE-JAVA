package com.java.external.Airconditioner;

import com.java.internal.Disney;

public class DisneyManager {
    public void animate(Disney disney) {
        if (disney != null) {
            disney.show(); //

            if (disney instanceof MickeyMouse) {
                MickeyMouse mm = (MickeyMouse) disney;
                mm.voice();
                mm.dance();
            } else {
                System.err.println("This Disney character is not MickeyMouse.");
            }
        } else {
            System.err.println("Disney object is null.");
        }
    }
}
