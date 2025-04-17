package com.ct.EH_Day4.Que4;

public class FinancialTransaction {

    // Method to process transaction
    public void processTransaction(double amount, long accountNumber) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Transaction amount must be positive.");
            }
    
            System.out.println("Processing transaction...");
            System.out.println("Transaction successful: Amount Rs." + amount + " transferred to account " + accountNumber);
    
        } catch (IllegalArgumentException e) {
            System.out.println("Error processing transaction: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
    
}
