package com.kodilla.good.patterns.allegro;

import java.time.LocalDate;

public class DatebaseSaleRepository implements SalesRepository {
    @Override
    public void createSaleProduct(User user, Product product, LocalDate dateOfSale) {
        System.out.println("\nZapisano do bazy danych sprzedaż " + product.getNameOfProduct() + " użytkownikowi " + user.getUserName()
                + " po cenie " + product.getPriceOfProduct() + " w dniu " + dateOfSale.toString());
        System.out.println("Dane kontaktowe: " + user.getEmail());
    }

}
