package com.ct.lambda.lambda_day1;

import java.util.Scanner;
import java.util.function.Predicate;

public class NumberTestern {

    public static void main(String[] args) {
         
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isPrime = n -> {
            if (n <= 1) return false;

            // Check divisibility from 2 to n/2
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check wether a number is even or not");
        Integer x =scanner.nextInt();
        System.out.println("Enter a number to check wether a number is Prime or not");
        Integer n =scanner.nextInt();

        System.out.println("===============================================");

        System.out.println("is Even "+isEven.test(x));
        System.out.println("is Prime "+isPrime.test(n));

        scanner.close();



    }

}
