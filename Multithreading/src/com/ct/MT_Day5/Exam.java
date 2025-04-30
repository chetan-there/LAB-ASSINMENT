package com.ct.MT_Day5;

class Task extends Thread {
    public void run() {
        synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task Completed by :"+Thread.currentThread().getName());
        }
    }
}

public class Exam {
    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task();
        Task task2 = new Task();
        task1.start();
        task2.start();
        task1.join();
        task2.join();
    }
}