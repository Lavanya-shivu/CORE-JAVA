package com.java.runner;

import com.java.external.Airconditioner.Mirrortype;

public class MirrorRunner {
    public static void main(String[] args) {
        Mirrortype mirrortype = new Mirrortype();
        mirrortype.reflect();
        System.out.println("--------------------------");

        mirrortype.clarity();
        mirrortype.view();
        mirrortype.view(mirrortype);  // passing non-null
        mirrortype.view(null);          // passing null
        System.out.println("==========================");
    }
}
