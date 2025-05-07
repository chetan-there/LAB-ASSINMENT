package com.ct.logical;

import java.util.stream.*;

public class ArmstrongRange {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 1000:");
        IntStream.rangeClosed(1, 1000)
                .filter(num -> {
                    int len = String.valueOf(num).length();
                    int sum = String.valueOf(num)
                            .chars()
                            .map(Character::getNumericValue)
                            .map(d -> (int) Math.pow(d, len))
                            .sum();
                    return sum == num;
                })
                .forEach(System.out::println);
    }
}
