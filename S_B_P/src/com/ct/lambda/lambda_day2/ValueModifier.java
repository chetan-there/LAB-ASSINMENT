package com.ct.lambda.lambda_day2;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier {

    // ✅ Method that takes Consumer as a parameter (performs action on value)
    public static void modifyValue(int num, Consumer<Integer> action) {
        action.accept(num);  // Runs the Consumer logic on the number
    }

    public static void main(String[] args) {

        // ✅ Consumer to double the value
        Consumer<Integer> doubleValue = num -> System.out.println("After doubling the value: " + (num * 2));

        // ✅ Consumer to increment the value by 3
        Consumer<Integer> incrementBy3 = num -> System.out.println("After incrementing the value by 3: " + (num + 3));

        // ✅ Consumer to square the value
        Consumer<Integer> squareValue = num -> System.out.println("After squaring the value: " + (num * num));

        // ✅ Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        Integer x = scanner.nextInt();

        System.out.println("=========================");

        // ✅ Show original value
        System.out.println("Original value: " + x);

        // ✅ Apply different operations using Consumers
        modifyValue(x, doubleValue);
        modifyValue(x, incrementBy3);

        // ✅ Only apply square if value is greater than 0
        if (x > 0) {
            modifyValue(x, squareValue);
        }

        scanner.close(); // ✅ Close scanner to avoid memory leaks
    }
}
