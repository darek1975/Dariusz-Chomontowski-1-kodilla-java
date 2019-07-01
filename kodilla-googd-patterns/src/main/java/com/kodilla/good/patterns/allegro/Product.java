package com.kodilla.good.patterns.allegro;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getNameOfProduct() {
        return name;
    }

    public BigDecimal getPriceOfProduct() {
        return price;
    }
}
