package com.Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList items = new ArrayList();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        // printDoubleFor(items);
        printDoubleStream(items);
    }

    private static void printDoubleStream(ArrayList items) {
        items.stream().forEach(item -> {
            int x = (Integer)item * 2;
            System.out.println(x);
        });
    }
}