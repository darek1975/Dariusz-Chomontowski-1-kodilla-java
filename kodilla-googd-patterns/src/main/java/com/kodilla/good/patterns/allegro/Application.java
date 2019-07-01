package com.kodilla.good.patterns.allegro;

public class Application {
    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        Processor processor = new Processor(new FoodInformationService(),
                new FoodSaleService(), new DatebaseSaleRepository());
        processor.process(order);
    }
}
