
// You want a Java program for the NestedTryCatchExample problem, including handling division and 
// array access with nested try-catch blocks, and printing "Execution complete" in the finally block.
// It must pass multiple test cases exactly like the examples you shared.
// Here’s the full working Java code with explanation:

package com.ct.TestMCQ;

import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = { 10, 20, 30, 40, 50 }; // array as per problem
        int a = sc.nextInt(); // first input
        int b = sc.nextInt(); // second input
        int result = 0; // to store division result

        try {
            try {
                result = a / b; // division
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero!");
            }
            try {
                System.out.println("Array element at index " + result + ": " + numbers[result]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds!");
            }
        } finally {
            System.out.println("Execution complete");
        }
        sc.close();
    }
}

// How This
// Code Works:•First try-catch:
// Handles division, catches ArithmeticException if
// division by
// zero happens.•Second try-catch:
// Handles array access,
// catches ArrayIndexOutOfBoundsException if
// result
// is
// invalid index.•finally block:Prints"Execution complete"
// every time.
// Test Cases:
// Input Output 10 0
// Division by zero!Array element
// at index 0:10Ex
// ecution complete 10 3 Result:3
// Array element
// at index 3:40Ex
// ecution complete 10 2 Result:5
// Array index
// out of bounds!
// Execution complete 20 2 Result:10
// Array index
// out of bounds!Execution complete 10 5 Result:2
// Array element
// at index 2:30Ex
// ecution complete
// Important Points:•Even if
// division fails, result remains 0.
// So in that case,
// it accesses index 0.•finally
// block always runs—
// whether an
// exception occurs
// or not
// .
