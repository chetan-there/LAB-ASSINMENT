package com.ct.EH_Day4;

public class ArrayStoreExample {

    // Method to store objects in a String array
    public static void storeObjects() {
        // Creating an array of String with Object reference (this allows runtime error)
        Object[] strings = new String[5];

        // Storing compatible and incompatible types
        strings[0] = "Hello"; // Storing a String
        strings[1] = "World"; // Storing another String
        strings[2] = "Java"; // Storing another String

        // Uncomment the below line one by one to test different cases
        // strings[2] = 123; // Trying to store an Integer — This will throw
        // ArrayStoreException
    }

    public static void main(String[] args) {
        try {
            storeObjects();
            System.out.println("Objects stored successfully.");
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException caught: Incompatible type: " + e.getMessage());
        }
    }
}
