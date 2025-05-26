package com.ct.collection_day4.task2;

/*
Activity:
Represents an activity with a name and schedule.
Contains a constructor to initialize the activity's details and getters to access these details.
Overrides the toString() method to provide a string representation of an activity.
*/
public class Activity {
    private String ac_name;
    private String ac_schedule;

    public Activity(String ac_name, String ac_schedule) {
        this.ac_name = ac_name;
        this.ac_schedule = ac_schedule;
    }

    @Override
    public String toString() {
        return "Activity [ac_name=" + ac_name + ", ac_schedule=" + ac_schedule + "]";
    }

}

