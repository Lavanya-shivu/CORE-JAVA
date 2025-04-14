package com.java.external.Airconditioner;

import com.java.internal.Leaf;

public class DryLeaf {
    public void dryLaef(Leaf leaf) {
        if (leaf != null) {
            System.out.println("Leaf is green!");

            if (leaf instanceof Tree) {
                Tree tree = (Tree) leaf;
                tree.provideShade();
                tree.dropLeaves();
            } else {
                leaf.photosynthesis();
                System.err.println("This is a DryLeaf.");
            }
        } else {
            System.err.println("Laef is null.");
        }
    }
}
