package com.kodilla.good.patterns.food2door;

public class HealthyShopSupplier implements Supplier{
    private String supplierName = "HealthyShop";
    private String supplierAdress = "Pruszków";

    @Override
    public boolean process(SupplierOrderRequest supplierOrderRequest) {
        System.out.println("Proceeding order by the " + supplierOrderRequest.getSupplier().getSupplierName() + "." + "\n" +
                "Ordered product: " + supplierOrderRequest.getProduct().getProductName() +
                "; quantity: " + supplierOrderRequest.getQuantity() + "; price " + supplierOrderRequest.getProduct().getSellingPrice() + ".");
        return true;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierAdress() {
        return supplierAdress;
    }
}
