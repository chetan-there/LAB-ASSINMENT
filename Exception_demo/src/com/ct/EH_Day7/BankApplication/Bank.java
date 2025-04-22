package com.ct.EH_Day7.BankApplication;

interface Bank {
    void deposit(double amount) throws InvalidAmountException;

    void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException;

    void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException,
            AccountNotFoundException, InvalidAmountException;

    void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException;

    double getBalance();
}