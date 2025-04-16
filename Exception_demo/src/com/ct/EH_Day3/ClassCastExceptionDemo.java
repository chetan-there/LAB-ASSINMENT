// Package declaration to organize the class
package com.ct.EH_Day3;

// Main class demonstrating ClassCastException handling
public class ClassCastExceptionDemo {

    // Method to demonstrate ClassCastException handling
    public static void handleClassCastException() {

        // Creating an Object array holding String elements
        Object[] arr = { "hello", "world", "java" };
        // Object[] arr = { "hello", 123, "java" }; // Adding an Integer in between


        // Looping through each object in the array
        for (Object ob : arr) {
            try {
                // Attempt to cast object to String (will succeed here)
                System.out.println("Casting successful: " + (String) ob); 
            } catch (Exception e) {
                // This block will not execute here unless we have a bad cast
                // Prints class name of the object and error message
                System.out.println("ClassCastException: Cannot cast " + ob.getClass().getName() + " to String.");

                // Print stack trace to help debug (shows where error occurred)
                e.printStackTrace();
            }
        }
    }

    // Main method to start execution
    public static void main(String[] args) {
        handleClassCastException(); // Call the method to test casting
    }
}


