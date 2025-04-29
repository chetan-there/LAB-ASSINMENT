package com.ct.MT_Day4.OLA;

public class FareCalculation extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("Calculating estimated fare...");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
