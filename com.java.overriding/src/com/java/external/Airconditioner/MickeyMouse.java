package com.java.external.Airconditioner;

import com.java.internal.Disney;

public class MickeyMouse extends Disney{
    public MickeyMouse() {
        System.out.println("No-argument constructor in MickeyMouse");
    }

    public void dance() {
        System.out.println("MickeyMouse is dancing happily!");
    }

    public void voice() {
        System.out.println("MickeyMouse says: Oh boy!");
    }

    public void voice(Disney disney) {
        if (disney != null) {
            System.out.println("Disney character speaks with charm.");
        } else {
            System.out.println("No Disney character to speak.");
        }
    }
}
