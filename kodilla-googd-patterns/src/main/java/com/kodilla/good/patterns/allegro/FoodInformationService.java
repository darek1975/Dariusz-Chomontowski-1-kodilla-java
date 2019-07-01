package com.kodilla.good.patterns.allegro;

import java.time.LocalDate;

public class FoodInformationService implements InformationService {
    public void inform(User user, Product product, LocalDate dateOfSale, boolean isSold) {
        if (isSold) {
            System.out.println("\nDzień dobry, " + user.getFirstName() + " " + user.getSurname()
                    + " właśnie kupiłeś " + product.getNameOfProduct());
            System.out.println("Data zakupu: " + dateOfSale.toString());
            System.out.println("Cena zakupu: " + product.getPriceOfProduct() + " zł");
        } else {
            System.out.println("Dzień dobry, " + user.getFirstName() + " " + user.getSurname()
                    + " niestety nie możemy zrealizować Twojego zamówienia");
        }
    }
}
