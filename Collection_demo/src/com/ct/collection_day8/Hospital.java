package com.ct.collection_day8;


import java.util.*;

class Hospital {
    private static int hospitalCodeCounter = 100;
    private int hospitalCode;
    private String hospitalName;
    private List<String> listOfTreatments;
    private String contactPerson;
    private String contactNumber;
    private String location;

    public Hospital(String hospitalName, List<String> listOfTreatments, 
                    String contactPerson, String contactNumber, String location) {
        this.hospitalCode = hospitalCodeCounter++;
        this.hospitalName = hospitalName;
        this.listOfTreatments = listOfTreatments;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
        this.location = location;
    }

    // Getters & Setters
    public int getHospitalCode() { return hospitalCode; }
    public String getHospitalName() { return hospitalName; }
    public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; }
    public List<String> getListOfTreatments() { return listOfTreatments; }
    public void setListOfTreatments(List<String> listOfTreatments) { this.listOfTreatments = listOfTreatments; }
    public String getContactPerson() { return contactPerson; }
    public void setContactPerson(String contactPerson) { this.contactPerson = contactPerson; }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    @Override
    public String toString() {
        return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + 
               ", listOfTreatments=" + listOfTreatments + ", contactPerson=" + contactPerson + 
               ", contactNumber=" + contactNumber + ", location=" + location + "]";
    }
}
