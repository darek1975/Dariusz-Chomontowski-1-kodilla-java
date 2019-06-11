package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[] args){
        Supplier glutenFreeShop = new GlutenFreeShopSupplier();
        Product product = new Product("M", "Milk", 2.32);
        SupplierOrderRequest supplierOrderRequest = new SupplierOrderRequest(glutenFreeShop, product, 10);
        SupplierOrderProcessing supplierOrderProcessing = new SupplierOrderProcessing();
        supplierOrderProcessing.orderProcess(supplierOrderRequest);
    }
}
