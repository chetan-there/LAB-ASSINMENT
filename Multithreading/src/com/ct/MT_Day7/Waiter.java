package com.ct.MT_Day7;

// BLC: Waiter class - Extends Thread to place order
public class Waiter extends Thread {
    private Restaurant restaurant;
    private String orderName;

    // Constructor to assign the restaurant object
    public Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    // Accept order from customer
    public void acceptOrder(String orderName) {
        this.orderName = orderName;
    }

    // Thread run method - places the order in restaurant
    @Override
    public void run() {
        restaurant.placeOrder(orderName); // Place the customer order
    }
}
