package com.ct.lambda.lambda_day2;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier {

    // ✅ Method to apply any function passed to it
    public static int applyFunction(int value, Function<Integer, Integer> function) {
        return function.apply(value); // Applies the logic and returns the result
    }

    public static void main(String[] args) {

        // ✅ Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sampleValue = scanner.nextInt(); // 🟢 Take input from user

        // ✅ Define Function to add 5
        Function<Integer, Integer> add = val -> val + 5;

        // ✅ Define Function to multiply by 2
        Function<Integer, Integer> multiply = val -> val * 2;

        // ✅ Define Function to subtract 3
        Function<Integer, Integer> subtract = val -> val - 3;

        // ✅ Print original value
        System.out.println("Original value: " + sampleValue);

        // ✅ Apply add function
        int afterAdd = applyFunction(sampleValue, add);
        System.out.println("After adding 5: " + afterAdd);

        // ✅ Apply multiply function
        int afterMultiply = applyFunction(sampleValue, multiply);
        System.out.println("After multiplying by 2: " + afterMultiply);

        // ✅ Apply subtract function
        int afterSubtract = applyFunction(sampleValue, subtract);
        System.out.println("After subtracting 3: " + afterSubtract);

        // ✅ Close Scanner
        scanner.close();
    }
}
