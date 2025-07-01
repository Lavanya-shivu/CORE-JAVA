package com.xworkz.guest;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> numbers  = new HashSet<>();

        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);

        System.out.println("Original HashSet:" + numbers);

        boolean removed = numbers.remove(6);

        System.out.println("After removing 6:" + numbers);
        System.out.println("Was 6 removed?" + removed);
    }
}
