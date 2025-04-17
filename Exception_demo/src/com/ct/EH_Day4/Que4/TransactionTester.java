package com.ct.EH_Day4.Que4;

import java.util.Scanner;

public class TransactionTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to read user input
        FinancialTransaction ft = new FinancialTransaction(); // Create instance of FinancialTransaction

        try {
            // Prompt user to enter transaction amount
            System.out.print("Enter transaction amount: ");
            String amountInput = sc.nextLine(); // Read amount as string

            // Prompt user to enter account number
            System.out.print("Enter account number: ");
            String accountInput = sc.nextLine(); // Read account number as string

            // Convert input strings to appropriate numeric types
            double amount = Double.parseDouble(amountInput); // May throw NumberFormatException
            long accountNumber = Long.parseLong(accountInput); // May throw NumberFormatException

            // Call method to process transaction
            ft.processTransaction(amount, accountNumber);

        } catch (NumberFormatException e) {
            // Catch invalid numeric input (e.g. abc instead of 123)
            System.out.println("Invalid input: Please enter a valid number for transaction amount or account number.");
        }

        sc.close(); // Close scanner resource
    }
}
