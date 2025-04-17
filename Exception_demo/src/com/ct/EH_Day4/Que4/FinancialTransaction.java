package com.ct.EH_Day4.Que4;

public class FinancialTransaction {

    // Method to validate and process the transaction
    public void processTransaction(double amount, long accountNumber) {
        try {
            // Check if amount is valid (must be positive)
            if (amount <= 0) {
                // If invalid, throw exception with custom message
                throw new IllegalArgumentException("Transaction amount must be positive.");
            }

            // If valid, print success message
            System.out.println("Processing transaction...");
            System.out.println(
                    "Transaction successful: Amount Rs." + amount + " transferred to account " + accountNumber);

        } catch (IllegalArgumentException e) {
            // Catch specific validation error
            System.out.println("Error processing transaction: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch any other unexpected runtime errors
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
