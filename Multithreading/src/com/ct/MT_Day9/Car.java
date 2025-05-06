package com.ct.MT_Day9;

import java.util.Random;

public class Car implements Runnable {
    private ParkingGarage garage;
    private String carName;

    public Car(ParkingGarage garage, String carName) {
        this.garage = garage;
        this.carName = carName;
    }

    @Override
    public void run() {
        try {
            garage.parkCar(carName);

            // Simulate random parking time
            Thread.sleep(new Random().nextInt(2000) + 1000);

            garage.freeSpot(carName);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(carName + " thread was interrupted.");
        }
    }
}