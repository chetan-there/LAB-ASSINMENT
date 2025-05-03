package com.ct.MT_Day6;

// EducationInstituteApp.java
public class EducationInstituteApp {
    public static void main(String[] args) {

        // Create some hardcoded courses
        Course c1 = new Course(1, "Mathematics", 1000);
        Course c2 = new Course(2, "Science", 1200);
        Course c3 = new Course(3, "English", 900);

        // Create some hardcoded offers
        Offer o1 = new Offer("Special discount: Get 20% off on all courses!");
        Offer o2 = new Offer("Limited time offer: Enroll in any two courses and get one course free!");

        // Initialize the education institute with the above courses and offers
        EducationInstitute institute = new EducationInstitute(new Course[]{c1, c2, c3}, new Offer[]{o1, o2});

        // Create student threads with preferred courses
        Student virat = new Student("Virat", institute, 1);  // wants Mathematics
        Student dhoni = new Student("Dhoni", institute, 2);  // wants Science

        // Start the student threads (runs concurrently)
        virat.start();
        dhoni.start();
        try {
            virat.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
       
    }
}
