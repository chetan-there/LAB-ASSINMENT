package com.ct.EH_Day8.ShoppingApppllication;

class InvalidProductException extends RuntimeException {
    public InvalidProductException(String message) {
        super(message);
    }
}