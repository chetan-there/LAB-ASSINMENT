package com.ct.MT_Day6;

public class EducationInstitute {

    String[] courses = new String[10];

    String[] offers = new String[10];

    public EducationInstitute(String[] courses, String[] offers) {
        this.courses = courses;
        this.offers = offers;
    }

    public String[] getCourses() {
        return courses;
    }

    public String[] getOffers() {
        return offers;
    }

    public void enrollStudentInCourse(int courseId, String studentName) {
        System.out.println("");
    }

}
