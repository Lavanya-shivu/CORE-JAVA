package com.java.Runner;

import com.java.external.Revolver.Revolver;
import com.java.internal.Revolver.Tool;
import com.java.internal.Revolver.Weapon;

public class ToolRunner {
    public static void main(String[] args) {
        System.out.println("Creating a Revolver object...\n");

        Revolver revolver = new Revolver();
        System.out.println();

        Weapon weapon = new Revolver();
        System.out.println();

        Tool tool = new Revolver();
    }
}
