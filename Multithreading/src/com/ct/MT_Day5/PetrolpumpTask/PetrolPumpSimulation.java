package com.ct.MT_Day5.PetrolpumpTask;

public class PetrolPumpSimulation {
    public static void main(String[] args) {
        PetrolPump petrolPump = new PetrolPump();

        Car[] cars = {
                new Car("Ford", petrolPump),
                new Car("g-class", petrolPump),
                new Car("farari", petrolPump),
                new Car("maruti", petrolPump)
        };

        Thread[] threads = new Thread[cars.length];

        for (int i = 0; i < cars.length; i++) {
            threads[i] = new Thread(cars[i]);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread " + i + " was interrupted.");
            }
        }
        System.out.println("All cars have completed refueling.");
    }
}
