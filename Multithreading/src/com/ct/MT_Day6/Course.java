package com.ct.MT_Day6;

// Course.java
public class Course {
    private int courseId;
    private String courseName;
    private double courseFee;

    // Constructor to initialize the course
    public Course(int courseId, String courseName, double courseFee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    // Getters
    public int getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }
    public double getCourseFee() { return courseFee; }

    // To print course details clearly
    @Override
    public String toString() {
        return courseId + ". " + courseName + " - Fee: Rs." + courseFee;
    }
}
