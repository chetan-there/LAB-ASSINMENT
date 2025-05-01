package com.ct.MT_Day6;

//ELC

public class EducationInstituteApp {

    public static void main(String[] args) {
        
      Course c1 = new Course(1, "Mathematics", 1000);
      Course c2 = new Course(2, "Science", 1200);
      Course c3 = new Course(3, "English", 900);

      Offer o1 = new Offer("Special discount: Get 20% off on all courses!");
      Offer o2 = new Offer("Limited time offer: Enroll in any two courses and get one course free!");
      
      Course[] courses = {c1, c2, c3};
      Offer[] offers = {o1, o2};
      EducationInstitute eInstitute = new EducationInstitute(courses, offers);
      System.out.println("Available courses");
      System.out.println(eInstitute.getCourses());
      System.out.println("Ongoing Offers: ");
      System.out.println(eInstitute.getOffers());

      
    }
    
}
