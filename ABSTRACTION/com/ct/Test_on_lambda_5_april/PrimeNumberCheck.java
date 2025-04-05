package com.ct.Test_on_lambda_5_april;

import java.util.Scanner;

interface PrimeCheck {
    boolean isPrime(int number);
}

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        PrimeCheck check = n -> {
            if (n <= 1) return false;
            if (n == 2) return true;
            if (n % 2 == 0) return false;
            for (int i = 3; i <= Math.sqrt(n); i += 2)
                if (n % i == 0) return false;
            return true;
        };
        if (num < 0) System.out.println("Number cannot be Negative");
        else if (check.isPrime(num)) System.out.println(num + " is a prime number.");
        else System.out.println(num + " is not a prime number.");
        scanner.close();
    }
}

