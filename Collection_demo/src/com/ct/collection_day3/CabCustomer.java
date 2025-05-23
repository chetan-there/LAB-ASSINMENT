package com.ct.collection_day3;

public class CabCustomer {
    // Defining fields
    private int custId;
    private String phone;
    private String customerName;
    private String pickupLocation;
    private String dropLocation;
    private int distance;

    // No-argument constructor
    public CabCustomer() {
    }

    // Parameterized constructor
    public CabCustomer(int custId, String phone, String customerName, String pickupLocation, String dropLocation,
            int distance) {
        this.custId = custId;
        this.phone = phone;
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.distance = distance;
    }

    // Getters and Setters
    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}