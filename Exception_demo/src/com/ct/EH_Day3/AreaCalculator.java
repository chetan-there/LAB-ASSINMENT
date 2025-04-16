// Package declaration (helps organize classes)
package com.ct.EH_Day3;

// Importing Scanner class from java.util package to take input from the user
import java.util.Scanner;

// Class to calculate the area of a rectangle and demonstrate exception handling
public class AreaCalculator {

    // Static method to calculate area of a rectangle
    public static double calculateArea(double length, double width) {
        // Check if both length and width are positive
        if (length > 0 && width > 0) {
            return length * width; // Valid case: return calculated area
        } else
            // Throw exception if invalid dimensions are given
            throw new IllegalArgumentException(); // Predefined exception class
    }

    // Main method - program execution starts here
    public static void main(String[] args) {
        // Creating Scanner object to read input from console
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter length
        System.out.println("Enter length of rectangle: ");
        double a = sc.nextDouble(); // Reads double value from input

        // Prompting user to enter width
        System.out.println("Enter width of rectangle: ");
        double b = sc.nextDouble(); // Reads double value from input

        // Handling possible exceptions using try-catch
        try {
            // Calling method to calculate area and print the result
            System.out.println(calculateArea(a, b));
        } catch (IllegalArgumentException e) {
            // Catch block to handle the thrown exception and print a user-friendly message
            System.out.println(
                    "IllegalArgumentException caught: Dimensions must be positive: length=" + a + ", width=" + b);

            // You can also use predefined methods to get class and exception details:
            System.out.println("Exception Class Name: " + e.getClass().getName()); // Fully qualified class name
            System.out.println("Exception Simple Name: " + e.getClass().getSimpleName()); // Only class name
        }
    }

}
