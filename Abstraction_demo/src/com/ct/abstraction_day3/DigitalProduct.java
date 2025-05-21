package com.ct.abstraction_day3;

public class DigitalProduct extends Product {
    private String licenseKey;

    public DigitalProduct(String name, double price, String category, String licenseKey) {
        super(name, price, category);
        setLicenseKey(licenseKey);
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
        double tax = getPrice() * 0.05; // 5% tax
        System.out.println("Tax RS: " + tax);
        return tax;
    }

    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        if (licenseKey == null || licenseKey.trim().isEmpty()) {
            throw new IllegalArgumentException("License Key cannot be empty or null.");
        }
        this.licenseKey = licenseKey.trim();
    }

    @Override
    public String toString() {
        return super.toString() + "\nLicense Key: " + licenseKey;
    }
}
