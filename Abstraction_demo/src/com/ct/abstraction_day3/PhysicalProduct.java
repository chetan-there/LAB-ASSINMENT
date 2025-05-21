package com.ct.abstraction_day3;

public class PhysicalProduct extends Product {
    private double shippingWeight;

    public PhysicalProduct(String name, double price, String category, double shippingWeight) {
        super(name, price, category);
        setShippingWeight(shippingWeight);
    }

    @Override
    public void applyDiscount(double percentage) {
        double discount = getPrice() * (percentage / 100);
        setPrice(getPrice() - discount);
        System.out.println("Discount applied: " + discount);
        System.out.println("New Price: " + getPrice());
    }

    @Override
    public double calculateTax() {
        double tax = getPrice() * 0.08; // 8% tax
        System.out.println("Tax RS: " + tax);
        return tax;
    }

    public double calculateShippingCost() {
        double shippingCost = shippingWeight * 5; // 5 RS per KG
        System.out.println("Shipping Cost RS: " + shippingCost);
        return shippingCost;
    }

    public double getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(double shippingWeight) {
        if (shippingWeight <= 0) {
            throw new IllegalArgumentException("Shipping weight must be positive.");
        }
        this.shippingWeight = shippingWeight;
    }

    @Override
    public String toString() {
        return super.toString() + "\nShipping Weight: " + shippingWeight + " kg";
    }
}
