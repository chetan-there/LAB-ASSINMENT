
/*TravelItineraryPlanner (Main Class):
Creates an instance of ItineraryPlanner.
Creates two Destination objects: "Paris" and "London".
Adds activities to each destination.
Adds these destinations to the itinerary planner.
Displays the itinerary by listing destinations and their respective activities. */
package com.ct.collection_day4.task2;

// Main Class: TravelItineraryPlanner
public class TravelItineraryPlanner {
    public static void main(String[] args) {
        // Creating an instance of ItineraryPlanner
        ItineraryPlanner it = new ItineraryPlanner();

        // Creating Destinations
        Destination paris = new Destination("Paris");
        paris.addActivity(new Activity("Visit Eiffel Tower", "Morning"));
        paris.addActivity(new Activity("Louvre Museum", "Afternoon"));

        Destination london = new Destination("London");
        london.addActivity(new Activity("British Museum", "Morning"));
        london.addActivity(new Activity("London Eye", "Afternoon"));

        // Adding destinations to itinerary planner
        it.addDestination(paris);
        it.addDestination(london);

        // Displaying the itinerary
        it.displayDestinations();
    }
}