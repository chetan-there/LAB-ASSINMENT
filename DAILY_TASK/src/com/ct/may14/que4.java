package com.ct.may14;

import java.util.Scanner;

class que4 {
    public static boolean Prime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
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

        System.out.print("Prime numbers in the array: ");
        for (int num : arr) {
            if (Prime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}