package com.ct.may14;

import java.util.Scanner;

class que3 {
    public static int sumOfArray(int arr[]) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
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

        System.out.println("Sum of array elements: " + sumOfArray(arr));
        sc.close();
    }
}