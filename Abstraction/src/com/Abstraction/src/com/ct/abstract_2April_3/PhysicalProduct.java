package com.ct.abstract_2April_3;

public class PhysicalProduct extends Product{

    
    private double shippingWeight ;
    private double Updatedprice;

    PhysicalProduct(String name, double price, String category, double plicensekey) {
        super(name, price, category);
        this.shippingWeight=plicensekey;
    }

    @Override
    public void applyDiscount(double percentage) {
        Updatedprice = (this.getPrice()-(this.getPrice() * percentage )/100);
        System.out.println("Orignal price : "+getPrice());
        System.out.println("Updated Price : "+Updatedprice);
    }

    @Override
    public double calculateTax() {
        return Updatedprice*0.08;
    }

    @Override
    public String toString() {
        return "PhysicalProduct [shippingWeight=" + shippingWeight + ", Updatedprice=" + Updatedprice + ", getPrice()="
                + getPrice() + ", calculateTax()=" + calculateTax() + "]";
    }


    


    

    
    
}
