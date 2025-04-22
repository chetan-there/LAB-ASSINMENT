package com.ct.EH_Day7.BankApplication;

class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}