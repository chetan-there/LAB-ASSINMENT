package com.ct.MT_Test;

// Business Logic Class for Account
class Account {
    private int balance = 0;

    // Synchronized withdraw method
    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            System.out.println("Insufficient balance for withdrawal: " + amount + ". Waiting...");
            try {
                wait(); // Wait until deposit is made
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | Updated Balance: " + balance);
    }
