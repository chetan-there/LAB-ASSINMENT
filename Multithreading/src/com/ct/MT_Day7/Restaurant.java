package com.ct.MT_Day7;

// BLC: Restaurant class - Handles order placing and preparation logic
public class Restaurant {
    private String name;
    private String order;
    private boolean isOrderReady = false; // Initially, no order is ready

    // Constructor to initialize restaurant name
    public Restaurant(String name) {
        this.name = name;
    }

    
    // Getter method for restaurant name
    public String getRestaurantName() {
        return name;
    }

    // Waiter places the order and waits for the chef to prepare it
    public synchronized void placeOrder(String order) {
        this.order = order;
        System.out.println("Waiter: Placed order for " + order);

        // Waiter waits until chef prepares the food
        while (!isOrderReady) {
            try {
                wait(); // Waiter thread goes to wait state
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Order is ready, waiter can serve now
        System.out.println("Waiter: Serving the " + order);
    }

    // Chef prepares the food and notifies the waiter
    public synchronized void prepareOrder() {
        System.out.println("Chef: Preparing " + order);

        try {
            Thread.sleep(2000); // Simulating time taken to prepare the food
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        isOrderReady = true; // Set flag as food is ready
        System.out.println("Chef: " + order + " is ready!");

        notify(); // Notify the waiter that food is ready
    }
}
