package com.ct.collection_day11;

import java.util.PriorityQueue;

public class ComparePriorityQueue {
    public static void main(String[] args) {
        // Initialize two PriorityQueue objects
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        PriorityQueue<String> pq2 = new PriorityQueue<>();

        // Add elements to pq1
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");

        // Add elements to pq2
        pq2.add("Red");
        pq2.add("Pink");
        pq2.add("Black");
        pq2.add("Orange");

        // Print both priority queues
        System.out.println("First Priority Queue: " + pq1);
        System.out.println("Second Priority Queue: " + pq2);

        // Compare elements
        for (String color : pq1) {
            if (pq2.contains(color)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}