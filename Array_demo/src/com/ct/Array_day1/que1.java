package com.ct.Array_day1;

import java.util.Scanner;

public class que1 {

    public static void searchIndex(int sa, int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (sa == arr[i]) {
                System.out.println("Element found at index: " + i);
                System.exit(0);
            }

        }
        System.out.println("Element not found");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array (N): ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        System.out.println("Enter " + N + " elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter searching element: ");
        int sa = sc.nextInt();

        searchIndex(sa, arr);

    }

}
