package com.ct.MT_Day4.OLA;

class FareCalculation extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Calculating estimated fare...");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Estimated fare: 135.75 RS.");
    }
}
