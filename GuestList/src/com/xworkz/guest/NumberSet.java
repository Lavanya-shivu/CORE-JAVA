package com.xworkz.guest;

import java.util.LinkedHashSet;
import java.util.Set;

public class NumberSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(10);
        numbers.add(20);

        System.out.println("LinkedHashNet contents:" + numbers);
    }
}
