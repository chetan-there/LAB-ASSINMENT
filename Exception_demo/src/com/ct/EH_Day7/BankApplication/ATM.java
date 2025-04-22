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

            while (!exit) {
                System.out.println("\nSelect an option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Transfer");
                System.out.println("4. Loan Application");
                System.out.println("5. Check Balance");
                System.out.println("6. Exit");
                System.out.print("Enter your option: ");

                try {
                    int option = scanner.nextInt();

                    switch (option) {
                        case 1: // Deposit
                            handleDeposit(customer1.getAccount(), scanner);
                            break;
                        case 2: // Withdraw
                            handleWithdrawal(customer1.getAccount(), scanner);
                            break;
                        case 3: // Transfer
                            handleTransfer(customer1.getAccount(), customer2.getAccount(), scanner);
                            break;
                        case 4: // Loan Application
                            handleLoanApplication(customer1.getAccount(), scanner);
                            break;
                        case 5: // Check Balance
                            System.out.println("Current balance: " + customer1.getAccount().getBalance());
                            break;
                        case 6: // Exit
                            exit = true;
                            System.out.println("Thank you for using our banking services!");
                            break;
                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine(); // Clear the invalid input
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }

    private static void handleDeposit(BankAccount account, Scanner scanner) {
        System.out.print("Enter deposit amount: ");
        try {
            double amount = scanner.nextDouble();
            account.deposit(amount);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid amount. Please enter a number.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private static void handleWithdrawal(BankAccount account, Scanner scanner) {
        System.out.print("Enter withdrawal amount: ");
        try {
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid amount. Please enter a number.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private static void handleTransfer(BankAccount fromAccount, BankAccount toAccount, Scanner scanner) {
        System.out.print("Enter transfer amount: ");
        try {
            double amount = scanner.nextDouble();
            fromAccount.transfer(toAccount, amount);
        } catch (InsufficientFundsException | AccountNotFoundException | InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid amount. Please enter a number.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private static void handleLoanApplication(BankAccount account, Scanner scanner) {
        System.out.print("Enter loan amount: ");
        try {
            double amount = scanner.nextDouble();
            account.applyForLoan(amount);
        } catch (LoanNotAllowedException | InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid amount. Please enter a number.");
            scanner.nextLine(); // Clear the invalid input
        }
    }
}