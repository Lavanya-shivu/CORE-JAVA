package com.xworkz.node.runner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

public class LinkRunner {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(21);
        arrayList.add(33);

        Spliterator<Integer> spliterator = arrayList.spliterator();
spliterator.forEachRemaining(System.out::println);

        System.out.println("=============================");

List<Integer> integers = arrayList.subList(1,4);
        System.out.println(integers);


        List<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(21);
        list.add(33);
    }
}
