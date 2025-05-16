package com.ct.logical;

public class palindrome {

    public static void main(String[] args) {

        int num = 121;

        int n = num;

        int res = 0;

        int rem = 0;

        while (num > 0) {

            rem = num % 10;

            res = (res * 10) + rem;

            num = num / 10;

        }

        if (n == res) {

            System.out.println(n+" Given number is palindrome");

        } else {

            System.out.println(n+" Given number is not a palindrome");

        }

    }

}

// %10------to get the last digit from a number

// *10------to increase a digit in a number

// /10---------to remove the last digit from a number
