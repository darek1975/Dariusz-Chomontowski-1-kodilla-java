package com.kodilla.good.patterns.allegro;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderRetriever {
    public Order retrieve() {

        User user = new User("Janusz", "Zieliński", "jzielinski", "jzielinski@gmail.com");
        Product product = new Product("Water Package", BigDecimal.valueOf(19.99));
        Order order = new Order(user, LocalDate.of(2019, 06, 29), product);

        return order;
    }
}
