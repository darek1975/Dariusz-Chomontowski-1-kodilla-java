package com.kodilla.good.patterns.food2door;

public class SupplierOrderRequest {
    private Supplier supplier;
    private Product product;
    private long quantity;

    public SupplierOrderRequest(final Supplier supplier, final Product product, final long quantity) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public long getQuantity() {
        return quantity;
    }
}
