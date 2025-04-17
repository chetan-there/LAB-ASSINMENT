package com.ct.EH_Day4.Que4;

import java.util.Scanner;

public class TransactionTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinancialTransaction ft = new FinancialTransaction();

        try {
            // Take user input
            System.out.print("Enter transaction amount: ");
            String amountInput = sc.nextLine();

            System.out.print("Enter account number: ");
            String accountInput = sc.nextLine();

            // Parse the inputs
            double amount = Double.parseDouble(amountInput);
            long accountNumber = Long.parseLong(accountInput);

            // Process the transaction
            ft.processTransaction(amount, accountNumber);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid number for transaction amount or account number.");
        }

        sc.close();
    }
}
