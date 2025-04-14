package com.java.external.Airconditioner;

import com.java.internal.Mirror;

public class ConcaveMirror {
    public void concaveMirror(Mirror mirror) {
        if (mirror != null) {
            System.out.println("Mirror is shining");

            if (mirror instanceof Mirrortype) {
                Mirrortype mirrortype = (Mirrortype) mirror;
                mirrortype.clarity();
                mirrortype.view();
            } else {
                mirror.reflect();
                System.err.println("This is a concave mirror.");
            }
        } else {
            System.err.println("mirror is null.");
        }
    }
}
