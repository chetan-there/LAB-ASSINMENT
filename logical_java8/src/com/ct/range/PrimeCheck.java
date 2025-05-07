package com.ct.logical;

import java.util.stream.*;

public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = num > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt(num))
                         .noneMatch(i -> num % i == 0);
        System.out.println(num + " is prime? " + isPrime);
    }
}
