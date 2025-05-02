package com.ct.MT_Day7;

// ELC: RestaurantSystem - Main entry point of the program
public class RestaurantSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to KFC Restaurant!!!");

        // Create a restaurant object
        Restaurant restaurant = new Restaurant("KFC");

        // Create waiter and chef threads
        Waiter waiter = new Waiter(restaurant);
        Chef chef = new Chef(restaurant);

        // Waiter accepts order from customer
        waiter.acceptOrder("fried chicken");

        // Start the threads
        waiter.start(); // Waiter places the order
        chef.start();   // Chef prepares the order
    }
}
