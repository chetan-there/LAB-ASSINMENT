package com.ct.MT_Day4.OLA;

public class DriverAssignment extends Thread{
    @Override
    public void run() {
        super.run();
        try {
        System.out.println("Driver found and assigned!");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
