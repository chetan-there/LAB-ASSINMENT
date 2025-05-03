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

    @Override
    public void run() {
        int[] withdrawals = {100, 200}; // Amounts to withdraw
        for (int amount : withdrawals) {
            account.withdraw(amount);
            try {
                Thread.sleep(1000); // 1 sec delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Depositor Thread Class
class Depositor extends Thread {
    private final Account account;

    public Depositor(Account account) {
        this.account = account;
    }
