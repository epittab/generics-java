package com.Generics.Introduction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        // by adding a type to generic, warnings help us avoid bugs
        // in example ArrayList is a Generic
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubleFor(items);
        // printDoubleStream(items);
    }

    private static void printDoubleStream(ArrayList<Integer> items) {
        items.stream().forEach(item -> {
            int x = item * 2;
            System.out.println(x);
        });
    }

    private static void printDoubleFor(ArrayList<Integer> n) {
        for (int i: n) {
            System.out.println(i * 2);
        }
    }
}