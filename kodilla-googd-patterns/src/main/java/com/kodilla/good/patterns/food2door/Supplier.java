package com.kodilla.good.patterns.food2door;

public interface Supplier {
    boolean process(SupplierOrderRequest supplierOrderRequest);
    String getSupplierName();
    String getSupplierAdress();
}
