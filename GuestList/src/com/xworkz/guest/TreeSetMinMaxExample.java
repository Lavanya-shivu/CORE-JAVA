package com.xworkz.guest;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMinMaxExample {
    public static void main(String[] args) {
        Set<Integer> number = new TreeSet<>();

        number.add(50);
        number.add(10);
        number.add(70);
        number.add(90);
        number.add(20);

        System.out.println("TreesSet (sorted):"+number);

        TreeSet<Integer> treeSet = (TreeSet<Integer>) number;

        int lowest = treeSet.first();
        int highest = treeSet.last();
    }
}
