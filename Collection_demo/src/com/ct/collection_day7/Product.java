package com.ct.collection_day7;

public class Product implements Comparable<Product> {

    private Integer productNumber;
    private String productName;
    private double productPrice;

    public Product(Integer productNumber, String productName, double productPrice) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public int compareTo(Product p) {
       return this.productName.compareToIgnoreCase(p.productName);
    }

    @Override
    public String toString() {
        return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
                + productPrice + "]";
    }

    

}
