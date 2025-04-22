package com.ct.EH_Day7.BankApplication;

public interface Bank {

    default void deposit(double amount){
        if(amount <= 0){
            throw new InvalidAmountException();
        }
    }

    void withdraw(double amount){
        
    }




}
