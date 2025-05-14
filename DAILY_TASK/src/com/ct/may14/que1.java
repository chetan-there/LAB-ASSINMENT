package com.ct.may14;

import java.util.Arrays;
import java.util.Scanner;

class que1 {
    public static void usingForLoop(int arr[]) {
        System.out.print("Using for loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void usingForEachLoop(int arr[]) {
        System.out.print("Using for-each loop: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void usingArraysToString(int arr[]) {
        System.out.println("Using Arrays.toString(): " + Arrays.toString(arr));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array (N): ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        System.out.println("Enter " + N + " elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        usingForLoop(arr);
        usingForEachLoop(arr);
        usingArraysToString(arr);
        sc.close();
    }
}

/*
 * 1. Using the `new` keyword with explicit size:
 * 
 * int[] numbers = new int[5]; // Declares an array with a size of 5
 * 
 * 
 * 2. Using the `new` keyword with initialization:**
 * 
 * int[] numbers = new int[]{1, 2, 3, 4, 5}; // Declares and initializes an
 * array
 * 
 * 
 * 3.Using array literal (shortcut initialization):
 * java
 * int[] numbers = {1, 2, 3, 4, 5}; // Simplified declaration and initialization
 * 
 * 
 */