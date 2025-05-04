package com.ct.MT_Test;

import java.util.Scanner;

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
    private final int withdraw1;
    private final int withdraw2;

    public Drawer(Account account, int withdraw1, int withdraw2) {
        this.account = account;
        this.withdraw1 = withdraw1;
        this.withdraw2 = withdraw2;
    }

    @Override
    public void run() {
        account.withdraw(withdraw1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        account.withdraw(withdraw2);
    }
}

// Depositor Thread Class
class Depositor extends Thread {
    private final Account account;
    private final int depositAmount;

    public Depositor(Account account, int depositAmount) {
        this.account = account;
        this.depositAmount = depositAmount;
    }

    @Override
    public void run() {
        account.deposit(depositAmount);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Main Execution Class
public class ATMMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter deposit amount: ");
        int depositAmount = sc.nextInt();

        System.out.print("Enter first withdrawal amount: ");
        int withdraw1 = sc.nextInt();

        System.out.print("Enter second withdrawal amount: ");
        int withdraw2 = sc.nextInt();

        // Create shared account
        Account account = new Account();

        // Create threads
        Drawer drawer = new Drawer(account, withdraw1, withdraw2);
        Depositor depositor = new Depositor(account, depositAmount);

        // Start threads
        drawer.start();
        depositor.start();
    }
}
