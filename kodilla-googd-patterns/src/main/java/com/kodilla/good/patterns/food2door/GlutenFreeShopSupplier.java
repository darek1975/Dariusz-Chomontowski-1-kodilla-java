package com.kodilla.good.patterns.food2door;

public class GlutenFreeShopSupplier implements Supplier{
    private String supplierName = "GlutenFreeShop";
    private String supplierAdress = "Piastów";

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
