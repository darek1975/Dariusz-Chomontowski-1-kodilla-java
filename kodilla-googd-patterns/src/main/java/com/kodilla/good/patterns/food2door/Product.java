package com.kodilla.good.patterns.food2door;

public class Product {
    private String productID;
    private String productName;
    private double sellingPrice;

    public Product(String productID, String productName, double sellingPrice) {
        this.productID = productID;
        this.productName = productName;
        this.sellingPrice = sellingPrice;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
