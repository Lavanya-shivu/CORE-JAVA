package com.java.Runner;

import com.java.external.sofa.Sofa;
import com.java.internal.sofa.Furniture;
import com.java.internal.sofa.Product;

public class SofaRunner {
    public static void main(String[] args) {
        System.out.println("Creating a Sofa object...\n");

        Sofa sofa = new Sofa();
        System.out.println();

        Furniture furniture = new Sofa();
        System.out.println();

        Product product = new Sofa();
    }
}
