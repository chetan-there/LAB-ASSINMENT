package com.ct.logical;

public class Fibbonacci {

    public static void main(String[] args) {

        int a = 1;

        int b = 3;

        System.out.println(a);

        System.out.println(b);

        for (int i = 1; i <= 10; i++) {

            int c = a + b;

            System.out.println(c);

            a = b;

            b = c;

        }

    }

}
