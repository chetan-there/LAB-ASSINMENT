package com.ct.MT_Day7;

// BLC: Chef class - Extends Thread to prepare order
public class Chef extends Thread {
    private Restaurant restaurant;

    // Constructor to assign the restaurant object
    public Chef(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    // Thread run method - chef prepares the order
    @Override
    public void run() {
        restaurant.prepareOrder(); // Prepare the order placed by waiter
    }
}
