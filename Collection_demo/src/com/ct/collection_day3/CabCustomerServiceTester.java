package com.ct.collection_day3;

public class CabCustomerServiceTester {
    public static void main(String[] args) {
        CabCustomerService service = new CabCustomerService();

        // Creating customers
        CabCustomer customer1 = new CabCustomer(101, "9876543210", "JOHN", "Ameerpet", "Madhapur", 4);
        CabCustomer customer2 = new CabCustomer(102, "9876543211", "SMITH", "Ameerpet", "Gachibowli", 6);
        CabCustomer customer3 = new CabCustomer(103, "9876543210", "JOHN", "Ameerpet", "Kukatpally", 8); // Same phone
                                                                                                         // as customer1

        // Adding customers
        service.addCabCustomer(customer1);
        service.addCabCustomer(customer2);
        service.addCabCustomer(customer3); // Existing customer

        // Printing bills
        service.printBill(customer1);
        service.printBill(customer2);
        service.printBill(customer3);
    }
}