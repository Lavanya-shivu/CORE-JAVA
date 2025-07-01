package com.xworkz.guest;

import java.util.TreeSet;

public class TreeSetRemove {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(20);
        numbers.add(50);
        numbers.add(12);
        numbers.add(90);

        System.out.println(numbers);

        numbers.removeAll(numbers.headSet(50));

        System.out.println(numbers);
    }
}
