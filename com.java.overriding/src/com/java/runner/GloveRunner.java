package com.java.runner;

import com.java.external.Airconditioner.LeatherGlove;

public class GloveRunner {
    public static void main(String[] args) {
        LeatherGlove glove = new LeatherGlove();
        glove.wear();
        System.out.println("--------------------------");

        glove.material();
        glove.remove();
        glove.remove(glove);
        glove.remove(null);
        System.out.println("==========================");
    }
}
