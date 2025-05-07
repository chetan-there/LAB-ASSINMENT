package com.ct.logical;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
        System.out.println("Reverse of " + num + " = " + reversed);
    }
}
