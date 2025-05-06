package com.ct.MT_Day9;

public class CarParkingProject {
    public static void main(String[] args) {
        System.out.println("Welcome to D-Mart Parking");
        int maxSpots = 5;
        ParkingGarage garage = new ParkingGarage(maxSpots);
        System.out.println("Total Available spots are :" + garage.getAvailableSpots());

        String[] cars = {
            "Maruti Brezza", "Tata Naxon", "Mahindra BE6", "Kia Seltos", "Honda city",
            "Toyota Fortuner", "Hundai i20"
        };

        Thread[] threads = new Thread[cars.length];
        for (int i = 0; i < cars.length; i++) {
            threads[i] = new Thread(new Car(garage, cars[i]));
            threads[i].start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Parking garage simulation is complete.");
    }
}
