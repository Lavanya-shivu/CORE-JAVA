package com.java.external.Airconditioner;

import com.java.internal.Leaf;

public class Tree extends Leaf {
    public Tree() {
        System.out.println("No-argument constructor in Tree");
    }

    public void provideShade() {
        System.out.println("Tree provides shade.");
    }

    public void dropLeaves() {
        System.out.println("Tree is dropping leaves.");
    }

    public void dropLeaves(Leaf leaf) {
        if (leaf != null) {
            System.out.println("Leaf is falling from the tree.");
        } else {
            System.out.println("No leaf to drop.");
        }
    }
}
