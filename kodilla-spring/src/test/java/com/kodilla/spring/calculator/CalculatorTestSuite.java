package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sumResult = calculator.add(12.4,3.1);
        double subResult = calculator.sub(23.2, 1.9);
        double mulResult = calculator.mul(3.1,4.2);
        double divResult = calculator.div(12.3,4.1);

        //Then
        Assert.assertEquals(15.5, sumResult, 0.01);
        Assert.assertEquals(21.3, subResult, 0.01);
        Assert.assertEquals(13.02, mulResult, 0.01);
        Assert.assertEquals(3, divResult, 0.01);
    }
}
