package com.ct.predefined_functional_interfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        /*
        Function<Integer, String> converter = new Function<Integer, String>() {
            public String apply(Integer i) {
                return "Traditional: " + (i * 2);
            }
        };
        */

        Function<Integer, String> converter = i -> "Lambda: " + (i * 2);

        System.out.println(converter.apply(5));
    }
}
