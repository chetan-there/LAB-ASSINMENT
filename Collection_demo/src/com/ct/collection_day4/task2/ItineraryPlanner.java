
/*
 ItineraryPlanner:
Manages a list of destinations.
Contains methods to add destinations and retrieve the list of destinations.
 */

package com.ct.collection_day4.task2;

import java.util.ArrayList;

// ItineraryPlanner Class
public class ItineraryPlanner {
    private ArrayList<Destination> destinations;

    public ItineraryPlanner() {
        this.destinations = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public void displayDestinations() {
        for (Destination destination : destinations) {
            System.out.println(destination);
        }
    }
}