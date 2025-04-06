package com.ct.predefined_functional_interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        /*
        UnaryOperator<Integer> square = new UnaryOperator<Integer>() {
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        */

        UnaryOperator<Integer> square = x -> x * x;

        System.out.println("Square: " + square.apply(6));
    }
}
