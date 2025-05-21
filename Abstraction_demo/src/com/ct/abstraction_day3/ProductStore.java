package com.ct.abstraction_day3;
import java.util.Scanner;

public class ProductStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Product Type:");
        System.out.println("1. Digital Product");
        System.out.println("2. Physical Product");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        try {
            switch (choice) {
                case 1:
                    System.out.print("Enter Digital Product Name: ");
                    String dName = scanner.nextLine();

                    System.out.print("Enter Product Price: ");
                    double dPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter Product Category: ");
                    String dCategory = scanner.nextLine();

                    System.out.print("Enter Product License Key: ");
                    String licenseKey = scanner.nextLine();

                    DigitalProduct digitalProduct = new DigitalProduct(dName, dPrice, dCategory, licenseKey);
                    System.out.println("\nDigital Product:\n" + digitalProduct);

                    digitalProduct.applyDiscount(10); // 10% discount
                    digitalProduct.calculateTax();
                    break;

                case 2:
                    System.out.print("Enter Physical Product Name: ");
                    String pName = scanner.nextLine();

                    System.out.print("Enter Product Price: ");
                    double pPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter Product Category: ");
                    String pCategory = scanner.nextLine();

                    System.out.print("Enter Product Weight: ");
                    double shippingWeight = scanner.nextDouble();

                    PhysicalProduct physicalProduct = new PhysicalProduct(pName, pPrice, pCategory, shippingWeight);
                    System.out.println("\nPhysical Product:\n" + physicalProduct);

                    physicalProduct.applyDiscount(15); // 15% discount
                    physicalProduct.calculateTax();
                    physicalProduct.calculateShippingCost();
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1 or 2.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
