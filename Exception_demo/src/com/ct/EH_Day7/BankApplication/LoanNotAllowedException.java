package com.ct.EH_Day7.BankApplication;

class LoanNotAllowedException extends RuntimeException {
    public LoanNotAllowedException(String message) {
        super(message);
    }
}
