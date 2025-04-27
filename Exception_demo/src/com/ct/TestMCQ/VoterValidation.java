// package com.ct.TestMCQ;
// You are working on the VoterValidation custom exception problem where:
// Problem:
// • Create a custom checked exception InvalidAgeException.
// • Write a method validateVoter(int age).
// • Conditions:
// o If age < 18 → print "Invalid age for voting!"
// o If age >= 18 → print "Valid voter!"
// o If age == 0 → print "Zero Not Allowed." (Special case)
// o If age < 0 → print "Negative age value not accepted."
// You failed one test case because zero (0) input needs a specific message "Zero Not Allowed."
// instead of "Negative age value not accepted.".
//  Here’s the correct Java code to solve ALL hidden test cases:
import java.util.Scanner;
// Custom Checked Exception
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
 super(message);
 }
}
public class VoterValidation {
 // Method to validate voter
 public static void validateVoter(int age) throws InvalidAgeException {
 if (age == 0) {
 throw new InvalidAgeException("Zero Not Allowed.");
 } else if (age < 0) {
 throw new InvalidAgeException("Negative age value not accepted.");
 } else if (age < 18) {
 throw new InvalidAgeException("Invalid age for voting!");
 } else {
 System.out.println("Valid voter!");
 }
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int age = sc.nextInt();
 try {
 validateVoter(age);
 } catch (InvalidAgeException e) {
 System.out.println(e.getMessage());
 }
 sc.close();
 }
}
//  Explanation:
// • Custom exception InvalidAgeException created extending Exception.
// • validateVoter(int age) method checks conditions:
// o age == 0 ➔ throw exception with "Zero Not Allowed."
// o age < 0 ➔ throw exception with "Negative age value not accepted."
// o age < 18 ➔ throw exception with "Invalid age for voting!"
// o Else ➔ print "Valid voter!"
// • main() method handles the exception using a try-catch block.
//  Sample Inputs and Expected Outputs:
// Input Output
// 15 Invalid age for voting!
// 20 Valid voter!
// 0 Zero Not Allowed.
// -5 Negative age value not accepted.
// 25 Valid voter!
//  Important Correction:
// • You must specifically check age == 0 before checking age < 0.
// • Otherwise, 0 would wrongly fall under negative values!
// Alri