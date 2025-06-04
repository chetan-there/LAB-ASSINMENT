package com.ct.collection_day11;
import java.util.PriorityQueue;

public class MergePriorityQueue {
    public static void main(String[] args) {
        // Initialize two PriorityQueue objects
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        PriorityQueue<String> queue2 = new PriorityQueue<>();

        // Add elements to queue1
        queue1.add("Red");
        queue1.add("Green");
        queue1.add("Orange");

        // Add elements to queue2
        queue2.add("Pink");
        queue2.add("White");
        queue2.add("Black");

        // Print both queues
        System.out.println("Priority Queue1: " + queue1);
        System.out.println("Priority Queue2: " + queue2);

        // Merge queue2 into queue1
        queue1.addAll(queue2);

        // Print merged queue
        System.out.println("New Priority Queue1: " + queue1);
    }
}