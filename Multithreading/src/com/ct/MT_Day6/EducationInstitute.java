package com.ct.MT_Day6;

// EducationInstitute.java
public class EducationInstitute {
    private Course[] courses;
    private Offer[] offers;

    // Constructor to initialize the institute with courses and offers
    public EducationInstitute(Course[] courses, Offer[] offers) {
        this.courses = courses;
        this.offers = offers;
    }

    // Returns all available courses
    public Course[] getCourses() {
        return courses;
    }

    // Returns all ongoing offers
    public Offer[] getOffers() {
        return offers;
    }

    // Enrolls a student in the course by courseId
    public void enrollStudentInCourse(int courseId, String studentName) {
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                System.out.println(studentName + " has enrolled in the course: " + course.getCourseName());
                return;
            }
        }
        System.out.println("Course ID " + courseId + " not found for student " + studentName);
    }
}
