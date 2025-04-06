package com.ct.predefined_functional_interfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        /*
        BiPredicate<Integer, Integer> isGreater = new BiPredicate<Integer, Integer>() {
            public boolean test(Integer a, Integer b) {
                return a > b;
            }
        };
        */

        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;

        System.out.println("Greater? " + isGreater.test(10, 5));
    }
}
