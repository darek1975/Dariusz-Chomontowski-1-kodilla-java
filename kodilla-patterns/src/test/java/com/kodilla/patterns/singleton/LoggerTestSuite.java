package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLastLogTest() {

        //Given
        Logger.getInstance().log("The first log");
        Logger.getInstance().log("The second log");
        Logger.getInstance().log("The third log");

        //When
        String lastLog = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals(lastLog, "The third log");
    }

}
