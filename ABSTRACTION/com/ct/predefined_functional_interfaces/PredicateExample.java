package com.ct.predefined_functional_interfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Traditional way using anonymous class
        /*
        Predicate<Integer> isEven = new Predicate<Integer>() {
            public boolean test(Integer x) {
                return x % 2 == 0;
            }
        };
        */

        // Lambda expression
        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println("Is Even? " + isEven.test(10));
    }
}
