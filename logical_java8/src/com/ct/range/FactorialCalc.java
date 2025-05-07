package com.ct.logical;

import java.util.stream.*;

public class FactorialCalc {
    public static void main(String[] args) {
        int num = 5;
        long fact = IntStream.rangeClosed(1, num)
                .reduce(1, (a, b) -> a * b);
        System.out.println("Factorial of " + num + " = " + fact);
    }
}
