package com.xworkz.guest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxInList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(25);
        numbers.add(30);
        numbers.add(15);
        numbers.add(90);
        numbers.add(45);

        System.out.println(numbers);

        int max = Collections.max(numbers);
        System.out.println(max);
    }
}
