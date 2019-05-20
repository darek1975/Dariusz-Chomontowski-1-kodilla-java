package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    @Autowired
    Display display;

    public double add(double a, double b) {
        System.out.print("Suma liczb " + a + " i " + b + " wynosi: " );
        return display.displayValue(a + b);
    }

    public double sub(double a, double b) {
        System.out.print("Róznica liczb " + a + " i " + b + " wynosi: " );
        return display.displayValue(a - b);
    }

    public double mul(double a, double b) {
        System.out.print("Iloczyn liczb " + a + " i " + b + " wynosi: " );
        return display.displayValue(a * b);
    }

    public double div(double a, double b) {
        System.out.print("Iloraz liczb " + a + " i " + b + " wynosi: " );
        return display.displayValue(a/b);
    }
}
