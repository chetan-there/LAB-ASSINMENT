package com.ct.may15;

import java.util.Scanner;

public class que4 {

    public static void evenoddNumbers(int N, int[] arr) {

        int ec = 0, od = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                // if (arr[i] > 0) {
                // even[i] = arr[i];
                // }
                ec++;

            } else {
                // odd[i] = arr[i];
                od++;
            }
        }
        int[] even = new int[ec];
        int[] odd = new int[od];
        int k = 0, l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] > 0) {
                    even[k++] = arr[i];
                }

            } else {
                odd[l++] = arr[i];

            }
        }
        System.out.println("Even :");
        for (int i = 0; i < even.length; i++) {

            System.out.println(even[i]);

        }

        System.out.println("Odd");
        for (int i = 0; i < odd.length; i++) {
            System.out.println(odd[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array (N): ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        System.out.println("Enter " + N + " elements : ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        evenoddNumbers(N, arr);

    }
}
