package com.xworkz.guest;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSortExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);

        System.out.println("TreeSet (sorted order):" + numbers);
    }
}
