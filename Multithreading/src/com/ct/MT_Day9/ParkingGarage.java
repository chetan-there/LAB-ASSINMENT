package com.ct.MT_Day9;

public class ParkingGarage {
    private int availableSpots;
    private final int MAX_SPOTS;

    public ParkingGarage(int maxSpots) {
        this.MAX_SPOTS = maxSpots;
        this.availableSpots = maxSpots;
    }

    public synchronized void parkCar(String carName) {
        while (availableSpots == 0) {
            try {
                System.out.println(carName + " is waiting for a spot.");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(carName + " interrupted while waiting.");
            }
        }
        availableSpots--;
        System.out.println(carName + " parked. Available spots: " + availableSpots);
        notifyAll();
    }

    public synchronized void freeSpot(String carName) {
        while (availableSpots == MAX_SPOTS) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(carName + " interrupted while leaving.");
            }
        }
        availableSpots++;
        System.out.println(carName + " left. Available spots: " + availableSpots);
        notifyAll();
    }

    public int getAvailableSpots() {
        return availableSpots;
    }
}
