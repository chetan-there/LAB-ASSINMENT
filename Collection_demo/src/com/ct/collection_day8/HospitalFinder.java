package com.ct.collection_day8;

import java.util.Arrays;

public class HospitalFinder {
    public static void main(String[] args) {
        HospitalService service = new HospitalService();
        
        int code1 = service.addHospital("YASHODA", Arrays.asList("Cardiac", "ENT", "Ortho", "Pediatric", "Gastro"), 
                                         "MATHEWS", "9848222222", "Sec");
        
        int code2 = service.addHospital("APOLLO", Arrays.asList("Neurology", "Oncology", "Ortho"), 
                                         "JONES", "9848333333", "Hyd");

        System.out.println("Hospital List: " + service.getHospitals());
        
        System.out.println("Details of Hospital " + code1 + ": " + service.getHospitalDetails(code1));
        System.out.println("Details of Hospital " + code2 + ": " + service.getHospitalDetails(code2));
    }
}