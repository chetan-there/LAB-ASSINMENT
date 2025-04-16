// Package declaration (helps organize similar classes together)
package com.ct.EH_Day3;

// Importing Scanner class to read user input from console
import java.util.Scanner;

// Main class for demonstrating exception handling with division
public class DivisionExample {

    // Method that performs division and returns the result
    public static int performDivision(int dividend, int divisor) {
        // If divisor is zero, ArithmeticException will be thrown automatically
        return dividend / divisor;
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Creating Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter dividend
        System.out.print("Enter dividend : ");
        int a = sc.nextInt(); // Reading integer input

        // Asking the user to enter divisor
        System.out.print("Enter divisor : ");
        int b = sc.nextInt(); // Reading integer input

        // Using try-catch block to handle possible division by zero
        try {
            // Performing division and printing the result
            System.out.println("Result of division: " + performDivision(a, b));
        } catch (ArithmeticException e) {
            // This block runs if divisor is zero
            System.out.println(
                    "ArithmeticException caught: Division by zero: " + " dividend= " + a + " , divisor= " + b);
        } finally {
            // Finally block executes no matter what (used to release resources)
            sc.close(); // Closing scanner to avoid memory leak
        }
    }
}
