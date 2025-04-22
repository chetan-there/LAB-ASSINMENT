package com.ct.EH_Day7.BankApplication;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ATM {
    public static void main(String[] args) {
        // Create some sample accounts
        BankAccount account1 = new BankAccount(1001, 10000);
        BankAccount account2 = new BankAccount(1002, 50000);

        Customer customer1 = new Customer("John Doe", account1);
        Customer customer2 = new Customer("Jane Smith", account2);

        Scanner scanner = new Scanner(System.in);

        // Using try-with-resources to ensure scanner is closed properly
        try (scanner) {
            boolean exit = false;
            
            // Display welcome screen
            printHeader("WELCOME TO JAVA BANK ATM");
            System.out.println("  Logged in as: " + customer1.getName());
            printSeparator();

            while (!exit) {
                printMenuHeader("MAIN MENU");
                System.out.println("╔══════════════════════════════╗");
                System.out.println("║ 1. Deposit                   ║");
                System.out.println("║ 2. Withdraw                  ║");
                System.out.println("║ 3. Transfer                  ║");
                System.out.println("║ 4. Loan Application          ║");
                System.out.println("║ 5. Check Balance             ║");
                System.out.println("║ 6. Exit                      ║");
                System.out.println("╚══════════════════════════════╝");
                printSeparator();
                System.out.print("  Enter your option (1-6): ");

                try {
                    int option = scanner.nextInt();

                    switch (option) {
                        case 1: // Deposit
                            printHeader("DEPOSIT");
                            handleDeposit(customer1.getAccount(), scanner);
                            break;
                        case 2: // Withdraw
                            printHeader("WITHDRAWAL");
                            handleWithdrawal(customer1.getAccount(), scanner);
                            break;
                        case 3: // Transfer
                            printHeader("TRANSFER");
                            System.out.println("  Transferring to: " + customer2.getName());
                            handleTransfer(customer1.getAccount(), customer2.getAccount(), scanner);
                            break;
                        case 4: // Loan Application
                            printHeader("LOAN APPLICATION");
                            handleLoanApplication(customer1.getAccount(), scanner);
                            break;
                        case 5: // Check Balance
                            printHeader("ACCOUNT BALANCE");
                            System.out.println("  Current balance: ₹" + String.format("%,.2f", customer1.getAccount().getBalance()));
                            printSeparator();
                            break;
                        case 6: // Exit
                            exit = true;
                            printHeader("THANK YOU");
                            System.out.println("  Thank you for using our banking services!");
                            System.out.println("  Have a nice day!");
                            printFooter();
                            break;
                        default:
                            System.out.println("\n  ❗ Invalid option. Please try again.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\n  ❗ Invalid input. Please enter a number (1-6).");
                    scanner.nextLine(); // Clear the invalid input
                } catch (Exception e) {
                    System.out.println("\n  ❗ Error: " + e.getMessage());
                }
            }
        }
    }

    private static void handleDeposit(BankAccount account, Scanner scanner) {
        System.out.print("  Enter deposit amount: ₹");
        try {
            double amount = scanner.nextDouble();
            account.deposit(amount);
            System.out.println("\n  ✔ Deposit successful!");
            System.out.println("  New balance: ₹" + String.format("%,.2f", account.getBalance()));
            printSeparator();
        } catch (InvalidAmountException e) {
            System.out.println("\n  ❗ Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("\n  ❗ Invalid amount. Please enter a number.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private static void handleWithdrawal(BankAccount account, Scanner scanner) {
        System.out.print("  Enter withdrawal amount: ₹");
        try {
            double amount = scanner.nextDouble();
            account.withdraw(amount);
            System.out.println("\n  ✔ Withdrawal successful!");
            System.out.println("  Remaining balance: ₹" + String.format("%,.2f", account.getBalance()));
            printSeparator();
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("\n  ❗ Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("\n  ❗ Invalid amount. Please enter a number.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private static void handleTransfer(BankAccount fromAccount, BankAccount toAccount, Scanner scanner) {
        System.out.print("  Enter transfer amount: ₹");
        try {
            double amount = scanner.nextDouble();
            fromAccount.transfer(toAccount, amount);
            System.out.println("\n  ✔ Transfer successful!");
            System.out.println("  Your new balance: ₹" + String.format("%,.2f", fromAccount.getBalance()));
            printSeparator();
        } catch (InsufficientFundsException | AccountNotFoundException | InvalidAmountException e) {
            System.out.println("\n  ❗ Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("\n  ❗ Invalid amount. Please enter a number.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private static void handleLoanApplication(BankAccount account, Scanner scanner) {
        System.out.print("  Enter loan amount: ₹");
        try {
            double amount = scanner.nextDouble();
            account.applyForLoan(amount);
            System.out.println("\n  ✔ Loan application submitted successfully!");
            System.out.println("  We will process your request shortly.");
            printSeparator();
        } catch (LoanNotAllowedException | InvalidAmountException e) {
            System.out.println("\n  ❗ Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("\n  ❗ Invalid amount. Please enter a number.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    // UI Helper Methods
    private static void printHeader(String title) {
        System.out.println();
        System.out.println("  ╔══════════════════════════════╗");
        System.out.println("  ║" + centerText(title, 22) + "        ║");
        System.out.println("  ╚══════════════════════════════╝");
    }
    
    private static void printMenuHeader(String title) {
        System.out.println();
        System.out.println("  ☆☆☆☆☆ " + title + " ☆☆☆☆☆");
    }
    
    private static void printSeparator() {
        System.out.println("  ──────────────────────────────");
    }
    
    private static void printFooter() {
        System.out.println();
        System.out.println("  ╔══════════════════════════════╗");
        System.out.println("  ║    JAVA BANK - SECURE ATM    ║");
        System.out.println("  ║   © 2023 All Rights Reserved ║");
        System.out.println("  ╚══════════════════════════════╝");
        System.out.println();
    }
    
    private static String centerText(String text, int length) {
        if (text.length() >= length) {
            return text.substring(0, length);
        }
        int before = (length - text.length()) / 2;
        int after = length - text.length() - before;
        return String.format("%" + before + "s%s%" + after + "s", "", text, "");
    }
}