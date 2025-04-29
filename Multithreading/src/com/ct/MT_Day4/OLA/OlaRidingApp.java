package com.ct.MT_Day4.OLA;

public class OlaRidingApp {
    public static void main(String[] args) {
        Thread t1 = new RideRequest();         // RideRequest
        Thread t2 = new DriverAssignment();    // DriverAssignment
        Thread t3 = new FareCalculation();     // FareCalculation
        Thread t4 = new LiveTracking();        // LiveTracking
        Thread t5 = new PaymentProcessing();   // PaymentProcessing
        Thread t6 = new RatingSystem();        // RatingSystem

        try {
            t1.start();  // Start RideRequest
            t3.start();  // Start FareCalculation (in parallel)
            t1.join();   // Wait until RideRequest completes

            t2.start();  // Start DriverAssignment
            t2.join();   // Wait until DriverAssignment completes

            t4.start();  // Start LiveTracking
            t4.join();   // Wait until LiveTracking completes

            t5.start();  // Start PaymentProcessing
            t5.join();   // Wait until Payment completes

            t6.start();  // Start RatingSystem
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}