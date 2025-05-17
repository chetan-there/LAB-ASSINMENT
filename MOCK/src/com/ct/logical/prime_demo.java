package com.ct.logical;

public class prime_demo {

    public static void main(String[] args) {

        int flag = 0;

        int n = 5;

        if (n == 0 || n == 1) {

            System.out.println("0 and 1 not considered as prime number");

        } else {

            for (int i = 2; i <= n / 2; i++) {

                if (n % i == 0) {

                    flag = 1;

                }

            }

            if (flag == 0) {

                System.out.println(n + " Given number is prime");

            } else {

                System.out.println(n + " Not prime");

            }

        }

    }

}
