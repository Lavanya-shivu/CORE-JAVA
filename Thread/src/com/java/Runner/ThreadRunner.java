package com.java.Runner;

import com.java.internal.Thread.Cotton;
import com.java.internal.Thread.Material;
import com.java.external.Thread.Thread;

public class ThreadRunner {
    public static void main(String[] args) {
        System.out.println("Creating a Thread object...\n");

        Thread thread = new Thread();
        System.out.println();

        Cotton cotton = new Thread();
        System.out.println();

        Material material = new Thread();
    }
}
