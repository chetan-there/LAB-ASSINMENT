package com.ct.MT_Day6;

public class EducationInstitute {

    Course[] courses;
    Offer[] offers;

    public EducationInstitute(Course[] courses, Offer[] offers) {
        this.courses = courses;
        this.offers = offers;
    }

    public Course[] getCourses() {
        return courses;
    }

    public Offer[] getOffers() {
        return offers;
    }

    public void enrollStudentInCourse(int courseId, String studentName) {
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                System.out.println(studentName + " hs enrolled in the course: " + course.getCourseName());
            }
        }
    }
}
