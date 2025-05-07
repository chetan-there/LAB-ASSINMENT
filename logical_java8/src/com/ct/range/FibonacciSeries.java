package com.ct.logical;

import java.util.*;
import java.util.stream.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        int limit = 10;
        List<Integer> fib = Stream.iterate(new int[]{0, 1}, a -> new int[]{a[1], a[0] + a[1]})
                .limit(limit)
                .map(a -> a[0])
                .collect(Collectors.toList());
        System.out.println("Fibonacci Series: " + fib);
    }
}

