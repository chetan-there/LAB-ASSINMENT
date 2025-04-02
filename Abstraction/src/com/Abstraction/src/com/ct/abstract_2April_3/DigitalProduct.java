package com.ct.abstract_2April_3;

public class DigitalProduct extends Product{


    private String licenseKay;
    private double Updatedprice;

    DigitalProduct(String name, double price, String category, String licenseKay) {
        super(name, price, category);
        this.licenseKay=licenseKay;
    }

    
    public String getLicenseKay() {
        return licenseKay;
    }

    

    public void setLicenseKay(String licenseKay) {
    this.licenseKay = licenseKay;
    }


    // discount_amount = (original_price * discount_percentage) / 100
    @Override
    public void applyDiscount(double percentage) {
        Updatedprice = this.getPrice()-(this.getPrice() * 0.10);
        System.out.println("Orignal price : "+getPrice());
        System.out.println("Updated Price : "+Updatedprice);
    }

    @Override
    public double calculateTax() {
        return Updatedprice*0.05;
    }


    @Override
    public String toString() {
        return "DigitalProduct [licenseKay=" + licenseKay + ", Updatedprice=" + Updatedprice + ", getLicenseKay()="
                + getLicenseKay() + ", getPrice()=" + getPrice() + ", calculateTax()=" + calculateTax() + "]";
    }


   

    
    

   

    
    


}
