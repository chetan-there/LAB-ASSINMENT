
package com.ct.logical;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(str + " is palindrome? " + isPalindrome);
    }
}
