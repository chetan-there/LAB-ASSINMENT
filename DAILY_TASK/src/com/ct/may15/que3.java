package com.ct.may15;

import java.util.Scanner;

public class que3 {

    public static void addFL(int [] arr) {
        int f=0,l=0;
        f=arr[0];
        l=arr[arr.length-1];
        
        System.out.println("Sum of first and last element : "+(l+f));
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

        addFL(arr);

    }

}
