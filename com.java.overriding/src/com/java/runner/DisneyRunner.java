package com.java.runner;

import com.java.external.Airconditioner.MickeyMouse;

public class DisneyRunner {
    public static void main(String[] args) {
        MickeyMouse mickey = new MickeyMouse();
        mickey.show();
        System.out.println("--------------------------");

        mickey.dance();
        mickey.voice();
        mickey.voice(mickey);
        mickey.voice(null);
        System.out.println("==========================");
    }
}
