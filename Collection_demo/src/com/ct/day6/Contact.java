package com.ct.day6;

public class Contact {
    private String name;
    private String phoneNumber;

    // Constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // To display contact details
    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber;
    }
}
