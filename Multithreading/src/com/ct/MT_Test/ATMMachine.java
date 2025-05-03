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

    // Synchronized deposit method
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Updated Balance: " + balance);
        notify(); // Notify waiting withdrawal thread
    }
}

// Drawer Thread Class
class Drawer extends Thread {
    private final Account account;

    public Drawer(Account account) {
        this.account = account;
    }

  