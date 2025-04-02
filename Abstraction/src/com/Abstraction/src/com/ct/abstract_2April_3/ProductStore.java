package com.ct.abstract_2April_3;

import java.util.Scanner;

public class ProductStore {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Product type : ");
        System.out.println("1. Digital Product \n" + "2. Physical Product");
        int choice=scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Digital Product Name : ");
                String dname=scanner.nextLine();
                scanner.nextLine();

                System.out.println("Enter Product Price : ");
                double dprice=scanner.nextDouble();

                System.out.println("Enter Product Category : ");
                scanner.nextLine();
                String dcatergory=scanner.nextLine();

                

                System.out.println("Enter Product License Key : ");
                String dlicensekey =scanner.nextLine();

                DigitalProduct digitalProduct = new DigitalProduct(dname, dprice, dcatergory, dlicensekey);

                System.out.println(digitalProduct);
                digitalProduct.applyDiscount(dprice);
                digitalProduct.calculateTax();

                break;
   
            case 2:
            System.out.println("Enter Physical  Product Name : ");
                String pname=scanner.nextLine();
                scanner.nextLine();

                System.out.println("Enter Product Price : ");
                double pprice=scanner.nextDouble();

                System.out.println("Enter Product Category : ");
                String pcatergory=scanner.nextLine();

                System.out.println("Enter shippingWeight : ");
                double pshippingWeight =scanner.nextDouble();

                PhysicalProduct physicalProduct = new PhysicalProduct(pname, pprice, pcatergory, pshippingWeight);
                System.out.println(physicalProduct);
                physicalProduct.applyDiscount(pprice);
                physicalProduct.calculateTax();
                
                break;
        
            default:
                System.out.println("Enter valid choice 1/2 !");
                break;
        }







        scanner.close();
    }
    
}
