package com.ct.EH_Day4;

public class CommandLineDivision {
    public static void main(String[] args) {
        try {
            // Check if exactly two arguments are passed
            if (args.length != 2) {
                throw new IllegalArgumentException("Exactly two arguments required.");
            }

            try {
                // Parse the input arguments into integers
                int dividend = Integer.parseInt(args[0]);
                int divisor = Integer.parseInt(args[1]);

                // Inner try block for division
                try {
                    double result = (double) dividend / divisor;
                    System.out.println("Division result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic error: " + e.getMessage());
                }

            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } finally {
            System.out.println("Division operation completed.");
        }
    }
}
