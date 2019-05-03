package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }


    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println("Wynik dzielenia wynosi: "+ result);
        } catch (ArithmeticException e) {
            System.out.println("Popełniłeś szkolny błąd: nie można podzielić przez zero: " + e);
        } finally {
            System.out.println("Dziękuję za skorzystanie z metody.");
        }
    }
}

