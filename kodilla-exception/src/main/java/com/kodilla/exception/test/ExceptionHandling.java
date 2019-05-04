package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            System.out.println(secondChallenge.probablyIWillThrowException(2,1));

        } catch (Exception e){

            System.out.println(e);
            System.out.println("Proszę wpisać argumenty spełniające warunek: x >= 1 albo x < 2 oraz y != 1.5. Spróbuj ponownie");

        } finally {
            System.out.println("Koniec.");
        }
    }
}
