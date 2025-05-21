package com.ct.Test_on_lambda_5_april;

import java.util.Scanner;
import java.util.function.Consumer;

public class FactorialUsingConsumer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Consumer<Integer> factorial = n -> {
            if (n < 0) {
                System.out.println("Number cannot be Negative");
                return;
            }
            long fact = 1;
            for (int i = 1; i <= n; i++) fact *= i;
            System.out.println("Factorial of " + n + " is: " + fact);
        };
        factorial.accept(num);
        scanner.close();
    }
}


