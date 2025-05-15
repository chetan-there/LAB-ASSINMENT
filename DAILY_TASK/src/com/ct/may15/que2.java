package com.ct.may15;

import java.util.Scanner;

public class que2 {

    public static void printReverse(int[] arr) {
        System.out.println("forword Order ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("==============================================");

        System.out.println("Reverse Order ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

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

        printReverse(arr);

    }

}
