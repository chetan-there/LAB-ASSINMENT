package com.ct.lambda.lambda_day2;

import java.util.Scanner;
import java.util.Random;
import java.util.function.Supplier;

public class NumberGenerator {

    // Method to generate a random number using Supplier
    public static int generateRandomNumber(int min, int max) {
        // Lambda expression for Supplier<Integer>
        Supplier<Integer> randomSupplier = () -> new Random().nextInt((max - min) + 1) + min;
        return randomSupplier.get(); // Get the generated random number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the minimum value: ");
        int min = scanner.nextInt();

        System.out.print("Enter the maximum value: ");
        int max = scanner.nextInt();

        // Generating and displaying the random number
        int randomNumber = generateRandomNumber(min, max);
        System.out.println("Random number generated: " + randomNumber);
    }
}
