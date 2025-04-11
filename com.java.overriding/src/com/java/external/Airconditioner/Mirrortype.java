package com.java.external.Airconditioner;

import com.java.internal.Mirror;

public class Mirrortype extends Mirror {
    public Mirrortype() {
        System.out.println("No-argument constructor in ObjectMirror");
    }

    public void clarity() {
        System.out.println("Mirror has high clarity and no distortion");
    }

    public void view() {
        System.out.println("Viewing the reflection");
    }

    public void view(Mirror mirror) {
        if (mirror != null) {
            System.out.println("Reflection is visible");
        } else {
            System.out.println("Nothing to reflect");
        }
    }
}