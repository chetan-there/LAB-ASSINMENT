package com.ct.collection_day3;

import java.util.ArrayList;

public class CabCustomerService {
    private ArrayList<CabCustomer> customerList = new ArrayList<>();

    // Add customer to the list
    public void addCabCustomer(CabCustomer customer) {
        if (isFirstCustomer(customer)) {
            customerList.add(customer);
            System.out.println(customer.getCustomerName() + " added successfully.");
        } else {
            System.out.println("Existing customer !!");
        }
    }

    // Check if the customer is new
    public boolean isFirstCustomer(CabCustomer cust) {
        for (CabCustomer existingCustomer : customerList) {
            if (existingCustomer.getPhone().equalsIgnoreCase(cust.getPhone())) {
                return false; // Customer exists
            }
        }
        return true; // New customer
    }

    // Calculate bill based on distance
    public double calculateBill(CabCustomer cust) {
        if (isFirstCustomer(cust)) {
            return 0.0;
        } else if (cust.getDistance() <= 4) {
            return 80.0;
        } else {
            return 80.0 + (cust.getDistance() - 4) * 6.0;
        }
    }

    // Print bill
    public void printBill(CabCustomer cust) {
        System.out.println(cust.getCustomerName() + " Please pay your bill of Rs." + calculateBill(cust));
    }
}