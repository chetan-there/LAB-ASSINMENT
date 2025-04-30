package com.ct.MT_Day5.PetrolpumpTask;

class PetrolPump {

    public synchronized void refillCar(String carName) {
        System.out.println(carName + " started refilling...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(carName + " was interrupted.");
        }
        System.out.println(carName + " completed refilling!");
    }
}