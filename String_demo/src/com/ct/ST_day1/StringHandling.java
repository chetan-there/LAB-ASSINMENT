package com.ct.ST_day1;

public class StringHandling {
    public static void main(String[] args) {
        String str = "NareshIT";
        char ch[] = { 'N', 'a', 'r', 'e', 's', 'h', 'I', 'T' };
        String str1 = new String(ch);
        System.out.println(str.length() + str1.length());
    }
}