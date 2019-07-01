package com.kodilla.good.patterns.allegro;

import java.time.LocalDate;

public class FoodSaleService implements SalesService {
    @Override
    public boolean sale(User user, LocalDate dateOfSale, Product product) {
        System.out.println("Sprzedaż " + product.getNameOfProduct() + " w dniu " + dateOfSale.toString()
                + ", kupujący: " + user.getFirstName());
        return true;
    }
}
