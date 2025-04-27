
// Problem Understanding:
// • Initial balance = $1000.
// • User enters the withdrawal amount.
// • If withdrawal amount > 1000, print:
// • Error: Insufficient funds. Available balance: $1000.0
// • Transaction complete.
// • If withdrawal amount <= 1000, deduct the amount and print:
// • Withdrawal successful. Remaining balance: $<remaining_balance>
// • Transaction complete.
//  Correct Java Code to Solve This:
package com.ct.TestMCQ;
import java.util.Scanner;
public class BankTransaction {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 double balance = 1000.0; // Initial balance
 double withdrawal = sc.nextDouble(); // Taking withdrawal amount
 if (withdrawal > balance) {
 System.out.println("Error: Insufficient funds. Available balance: $" + balance);
 } else {
 balance = balance - withdrawal;
 System.out.println("Withdrawal successful. Remaining balance: $" + balance);
 }
 System.out.println("Transaction complete.");
 
 sc.close();
 }
}
//  Sample Inputs and Expected Outputs:
// Input Output
// 500 Withdrawal successful. Remaining balance: $500.0 Transaction complete.
// 1200 Error: Insufficient funds. Available balance: $1000.0 Transaction complete.
// 1000 Withdrawal successful. Remaining balance: $0.0 Transaction complete.
// 0 Withdrawal successful. Remaining balance: $1000.0 Transaction complete.
//  Important Points:
// • Always show balance with .0 (use double for decimal format).
// • Always print "Transaction complete." at the end, whether withdrawal successful or failed.
// • Do not use custom exceptions unless asked; simple if-else is enoug