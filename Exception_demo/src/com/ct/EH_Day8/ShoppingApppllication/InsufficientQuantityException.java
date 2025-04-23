package com.ct.EH_Day8.ShoppingApppllication;

class InsufficientQuantityException extends Exception {
    public InsufficientQuantityException(String message) {
        super(message);
    }
}