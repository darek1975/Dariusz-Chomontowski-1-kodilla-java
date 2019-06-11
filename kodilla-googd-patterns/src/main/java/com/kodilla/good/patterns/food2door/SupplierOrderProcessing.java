package com.kodilla.good.patterns.food2door;

public class SupplierOrderProcessing {
    public OrderDTO orderProcess(SupplierOrderRequest supplierOrderRequest) {
        boolean isOrdered = supplierOrderRequest.getSupplier().process(supplierOrderRequest);
        if (isOrdered) {
            System.out.println("Order proceed");
            return new OrderDTO(supplierOrderRequest.getSupplier(), isOrdered);
        } else {
            System.out.println("Order not proceed");
            return new OrderDTO(supplierOrderRequest.getSupplier(), isOrdered);
        }
    }
}
