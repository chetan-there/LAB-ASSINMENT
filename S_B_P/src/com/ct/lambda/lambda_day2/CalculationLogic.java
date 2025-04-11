// ✅ Package structure
package com.ct.lambda.lambda_day2;

// ✅ Import Predicate functional interface and Scanner class
import java.util.Scanner;
import java.util.function.Predicate;

public class CalculationLogic {

    // ✅ Method that accepts Predicate as parameter
    // This method will return true/false based on the logic passed through Predicate
    public static boolean testpredicate(int num , Predicate<Integer> x){
        // test() method checks the condition passed by lambda
        return x.test(num);
    }

    public static void main(String[] args) {

        // ✅ Predicate to check if number is EVEN
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // ✅ Predicate to check if number is GREATER THAN 10
        Predicate<Integer> isGreaterThanTen = num -> num > 10;

        // ✅ Predicate to check if number is PRIME
        Predicate<Integer> isPrime = num -> {
            if (num <= 1) return false;        // not prime
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) return false; // divisible → not prime
            }
            return true; // no divisors → prime
        };

        // ✅ Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        Integer x = scanner.nextInt();  // Read input number

        // ✅ Call the testpredicate() method with different logic (Predicates)
        System.out.println("Is Even? → " + testpredicate(x, isEven));
        System.out.println("Is Greater Than 10? → " + testpredicate(x, isGreaterThanTen));
        System.out.println("Is Prime? → " + testpredicate(x, isPrime));

        // ✅ Close scanner to avoid resource leak
        scanner.close();
    }
}
