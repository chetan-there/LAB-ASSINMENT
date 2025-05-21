package com.ct.Test_on_lambda_5_april;

import java.util.Scanner;
import java.util.function.Consumer;

public class SumOfDivisorsUsingConsumer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Consumer<Integer> sumOfDivisors = n -> {
            if (n <= 0) {
                System.out.println("Number cannot be Negative");
                return;
            }
            int sum = 0;
            for (int i = 1; i <= n; i++) if (n % i == 0) sum += i;
            System.out.println("Sum of divisors of " + n + " is: " + sum);
        };
        sumOfDivisors.accept(num);
        scanner.close();
    }
}