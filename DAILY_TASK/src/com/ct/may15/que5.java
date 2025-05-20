package com.ct.may15;

import java.util.Scanner;

public class que5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array separated by spaces:");
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);

        }

        int n = arr.length;
        if (n % 2 == 1) {
            // Odd-length array, print the middle element
            System.out.println(arr[n / 2]);
        } else {
            // Even-length array, print both middle elements
            System.out.println(arr[(n / 2) - 1] + " " + arr[n / 2]);
        }

        scanner.close();
    }
}