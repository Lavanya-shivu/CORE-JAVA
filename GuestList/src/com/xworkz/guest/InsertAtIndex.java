package com.xworkz.guest;

import java.util.ArrayList;

public class InsertAtIndex {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Before Inserting 99 at index 2:" + numbers);

        numbers.add(2,99);

        System.out.println("After Inserting 99 at index 2:" + numbers);
     }
}
