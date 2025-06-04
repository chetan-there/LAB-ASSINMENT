package com.ct.collection_day11;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Initialize a PriorityQueue that stores strings
        PriorityQueue<String> colorsQueue = new PriorityQueue<>();

        // Add five different colors
        colorsQueue.add("Red");
        colorsQueue.add("Green");
        colorsQueue.add("Orange");
        colorsQueue.add("White");
        colorsQueue.add("Black");

        // Print all elements of the PriorityQueue
        System.out.println("Priority Queue Elements: " + colorsQueue);
    }
}