package com.ct.MT_Day6;

// Student.java
public class Student extends Thread {
    private String name;
    private EducationInstitute institute;
    private int preferredCourseId;

    // Constructor to set name, institute, and preferred course
    public Student(String name, EducationInstitute institute, int preferredCourseId) {
        this.name = name;
        this.institute = institute;
        this.preferredCourseId = preferredCourseId;
    }

    // Displays available courses
    public void viewCoursesAndFees() {
        System.out.println("\nAvailable Courses:");
        for (Course course : institute.getCourses()) {
            System.out.println(course);
        }
    }

    // Displays current offers
    public void viewOffers() {
        System.out.println("\nOngoing Offers:");
        for (Offer offer : institute.getOffers()) {
            System.out.println(offer.getOfferText());
        }
    }

    // Enroll in a specific course
    public void enrollInCourse(int courseId) {
        institute.enrollStudentInCourse(courseId, name);
    }

    // Runs when thread starts
    @Override
    public void run() {
        viewCoursesAndFees();
        viewOffers();
        enrollInCourse(preferredCourseId);
    }
}
