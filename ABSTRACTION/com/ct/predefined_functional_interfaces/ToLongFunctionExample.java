package com.ct.predefined_functional_interfaces;

import java.util.function.ToLongFunction;

public class ToLongFunctionExample {
    public static void main(String[] args) {
        /*
        ToLongFunction<Integer> squareFunc = new ToLongFunction<Integer>() {
            public long applyAsLong(Integer x) {
                return (long) x * x;
            }
        };
        */

        ToLongFunction<Integer> squareFunc = x -> (long) x * x;

        System.out.println("Square (long): " + squareFunc.applyAsLong(7));
    }
}
