
/*
Destination:
Represents a destination with a name and a list of activities.
Has a constructor to set the destination's name and initialize an empty list of activities.
Provides methods to add activities to the destination and retrieve the list of activities.
Overrides the toString() method to provide a string representation of a destination.
 */

package com.ct.collection_day4.task2;

import java.util.ArrayList;

// Destination Class
public class Destination {
    private String destination_name;
    private ArrayList<Activity> activities_list;

    public Destination(String destination_name) {
        this.destination_name = destination_name;
        this.activities_list = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        activities_list.add(activity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Destination: ").append(destination_name).append("\n");
        for (Activity activity : activities_list) {
            sb.append(activity.toString()).append("\n");
        }
        return sb.toString();
    }
}