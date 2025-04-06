package com.ct.predefined_functional_interfaces;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        /*
        BiFunction<Integer, Integer, Integer> add = new BiFunction<Integer, Integer, Integer>() {
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };
        */

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println("Sum: " + add.apply(4, 6));
    }
}
