package com.ct.Test_on_lambda_5_april;


import java.util.Scanner;

interface PalindromeCheckerInterface {
    boolean isPalindrome(int number);
}

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        PalindromeCheckerInterface checker = n -> {
            int original = n, reversed = 0;
            while (n > 0) {
                reversed = reversed * 10 + n % 10;
                n /= 10;
            }
            return original == reversed;
        };

        if (num < 0) {
            System.out.println("Number cannot be Negative");
        } else if (checker.isPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }

        scanner.close();
    }
}