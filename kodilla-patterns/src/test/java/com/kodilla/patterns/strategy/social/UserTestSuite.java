package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User YarekGeneration = new YGeneration("YarekGeneration");
        User ZdzichGeneration = new ZGeneration("ZdzichGeneration");
        User MilenMillins = new Millenials("MilenMillins");

        //When
        String yGenerationShare = YarekGeneration.getSocialPublisher().share();
        String zGenerationShare = ZdzichGeneration.getSocialPublisher().share();
        String millenialsShare = MilenMillins.getSocialPublisher().share();

        //Then
        Assert.assertEquals("Twitter", yGenerationShare);
        System.out.println(YarekGeneration.getUserName() + " is on: " + yGenerationShare);
        Assert.assertEquals("Snapchat", zGenerationShare);
        System.out.println(ZdzichGeneration.getUserName() + " is on: " + zGenerationShare);
        Assert.assertEquals("Facebook", millenialsShare);
        System.out.println(MilenMillins.getUserName() + " is on: " + millenialsShare);
    }

    @Test
    public void testIndividualSharingStrategies() {
        //Given
        User YarekGeneration = new YGeneration("YarekGeneration");
        User ZdzichGeneration = new ZGeneration("ZdzichGeneration");
        User MilenMillins = new Millenials("MilenMillins");

        //When
        YarekGeneration.setSocialPublisher(new SnapchatPublisher());
        ZdzichGeneration.setSocialPublisher(new TwitterPublisher());
        MilenMillins.setSocialPublisher(new SnapchatPublisher());

        //Then
        Assert.assertEquals("Snapchat", YarekGeneration.getSocialPublisher().share());
        System.out.println(YarekGeneration.getUserName() + " is on: " + YarekGeneration.getSocialPublisher().share());
        Assert.assertEquals("Twitter", ZdzichGeneration.getSocialPublisher().share());
        System.out.println(ZdzichGeneration.getUserName() + " is on: " + ZdzichGeneration.getSocialPublisher().share());
        Assert.assertEquals("Snapchat", MilenMillins.getSocialPublisher().share());
        System.out.println(MilenMillins.getUserName() + " is on: " + MilenMillins.getSocialPublisher().share());
    }
}
