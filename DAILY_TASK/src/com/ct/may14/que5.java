package com.ct.may14;

import java.util.Arrays;
import java.util.Scanner;

class SortArray {
    public static int[] ascendingSort(int arr[]) {
        Arrays.sort(arr);
        return arr;
    }

    public static int[] descendingSort(int arr[]) {
        int[] sortedArr = ascendingSort(arr.clone());
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < sortedArr.length; i++) {
            reversedArr[i] = sortedArr[sortedArr.length - 1 - i];
        }
        return reversedArr;
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

        System.out.println("Ascending order: " + Arrays.toString(ascendingSort(arr)));
        System.out.println("Descending order: " + Arrays.toString(descendingSort(arr)));

        sc.close();
    }
}