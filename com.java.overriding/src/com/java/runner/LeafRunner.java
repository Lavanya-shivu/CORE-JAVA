package com.java.runner;

import com.java.external.Airconditioner.Tree;

public class LeafRunner {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.photosynthesis();        // from Leaf (base class)
        System.out.println("--------------------------");

        tree.provideShade();          // Tree class method
        tree.dropLeaves();            // Tree class method
        tree.dropLeaves(tree);        // passing object
        tree.dropLeaves(null);        // passing null
        System.out.println("==========================");
    }
}
