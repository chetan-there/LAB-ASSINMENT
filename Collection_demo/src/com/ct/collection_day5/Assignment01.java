package com.ct.collection_day5;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment01 {

    // Step 1: Method to retrieve element from list
    public static Object retrieveElement(ArrayList<Object> arrayList, int index) throws IndexOutOfBoundsException {
        return arrayList.get(index);  // Throws exception if index is invalid
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> list = new ArrayList<>();

        System.out.print("Enter the number of elements you want to add to the list: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear buffer

        // Step 2: Add n elements to the list
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String input = sc.nextLine();

            // Check if it is a valid Integer or String
            try {
                // Try parsing to Integer
                int intValue = Integer.parseInt(input);
                list.add(intValue);
            } catch (NumberFormatException e) {
                // If not Integer, treat it as String if it contains letters
                if (input.matches("[a-zA-Z ]+")) {
                    list.add(input);
                } else {
                    System.out.println("Element is not valid as per requirement.");
                }
            }
        }

        // Step 3: Ask for index to retrieve
        System.out.print("Enter the index you want to retrieve: ");
        int index = sc.nextInt();

        // Step 4: Use try-catch to handle invalid index
        try {
            Object value = retrieveElement(list, index);
            System.out.println("Element at index " + index + ": " + value);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The index at which you are searching is not available.");
        }

        sc.close();
    }
}
