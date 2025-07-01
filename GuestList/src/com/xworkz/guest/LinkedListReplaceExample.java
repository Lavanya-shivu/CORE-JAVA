package com.xworkz.guest;

import java.util.LinkedList;

public class LinkedListReplaceExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("One");
        names.add("Two");
        names.add("Three");

        System.out.println("Before update:" + names);

        names.set(1, "UpdatedValues");

        System.out.println("After updates:" + names);
    }
}
