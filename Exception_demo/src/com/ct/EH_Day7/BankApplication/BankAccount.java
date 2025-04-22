package com.ct.EH_Day7.BankApplication;

class BankAccount implements Bank {
    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal. Current balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
    }

    @Override
    public void transfer(BankAccount toAccount, double amount)
            throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {
        if (toAccount == null) {
            throw new AccountNotFoundException("Target account not found");
        }
        if (amount <= 0) {
            throw new InvalidAmountException("Transfer amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for transfer. Current balance: " + balance);
        }

        this.withdraw(amount);
        toAccount.deposit(amount);
        System.out.println("Transferred: " + amount + " to account: " + toAccount.getAccountNumber());
    }

    @Override
    public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Loan amount must be positive");
        }
        if (amount > 50000) {
            throw new LoanNotAllowedException("Loan amount exceeds maximum limit of 50000");
        }
        if (balance < 50000) {
            throw new LoanNotAllowedException("Insufficient balance for loan. Minimum balance required: 50000");
        }

        balance += amount;
        System.out.println("Loan approved: " + amount + ". New balance: " + balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}