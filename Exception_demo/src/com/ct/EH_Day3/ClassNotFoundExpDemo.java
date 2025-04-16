// Package declaration (used to organize classes)
package com.ct.EH_Day3;

// Importing Scanner class to take user input
import java.util.Scanner;

// Class to demonstrate handling of ClassNotFoundException
public class ClassNotFoundExpDemo {

    // Constructor that takes a class name and tries to load it dynamically
    public ClassNotFoundExpDemo(String className) {
        try {
            // Try to load the class by name using reflection
            Class<?> x = Class.forName(className); // Might throw ClassNotFoundException

            // If class is found, print success message
            System.out.println("Class " + className + " is found  : " + x);
        } catch (ClassNotFoundException e) {
            // Catch block if class is not found

            // Print exception message
            System.out.println(e); // Calls e.toString()

            // Print complete stack trace (method calls leading to exception)
            e.printStackTrace();
        }
    }

    // Main method where execution begins
    public static void main(String[] args) {
        // Scanner object for reading user input
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a class name
        System.out.println("Enter the class name to load ");

        // Reading class name from user input
        String cName = sc.next();

        // Creating object of ClassNotFoundExpDemo which calls constructor
        new ClassNotFoundExpDemo(cName);

        // Closing Scanner object (good practice)
        sc.close();
    }
}
