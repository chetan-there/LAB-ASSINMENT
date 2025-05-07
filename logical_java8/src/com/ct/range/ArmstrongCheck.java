package com.ct.range;

public class ArmstrongCheck {
    public static void main(String[] args) {
        int number = 153;
        int len = String.valueOf(number).length();
        int sum = String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .map(d -> (int) Math.pow(d, len))
                .sum();
        System.out.println(number + " is Armstrong? " + (sum == number));
    }
}
