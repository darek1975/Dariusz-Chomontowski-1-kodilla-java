package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMacBuilder() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sezame")
                .sauce("Mayonnaise")
                .burgers(2)
                .ingredient("Onion")
                .ingredient("Pickle")
                .ingredient("Shrimp")
                .build();

        //When
        System.out.println(bigmac);

        //Then
        Assert.assertEquals(3, bigmac.getIngredients().size());
    }
}
