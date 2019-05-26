package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuit {
    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testCalculateAdvStatisticsWhenPostsOComments120UsersO() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> testUsers = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(0, forumStatistics.averagePostsPerUser, 0.001);
        Assert.assertEquals(0, forumStatistics.averageCommentsPerUser, 0.001);
        Assert.assertEquals(0, forumStatistics.averageCommentsPerPost, 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenPost20Comments120User100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> testUser = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            testUser.add("user");
        }

        when(statisticsMock.usersNames()).thenReturn(testUser);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(120);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(0.2, forumStatistics.averagePostsPerUser, 0.001);
        Assert.assertEquals(1.2, forumStatistics.averageCommentsPerUser, 0.001);
        Assert.assertEquals(6, forumStatistics.averageCommentsPerPost, 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenPost200Comments120User100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> testUser = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            testUser.add("user");
        }

        when(statisticsMock.usersNames()).thenReturn(testUser);
        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(120);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(2.0, forumStatistics.averagePostsPerUser, 0.001);
        Assert.assertEquals(1.2, forumStatistics.averageCommentsPerUser, 0.001);
        Assert.assertEquals(0.6, forumStatistics.averageCommentsPerPost, 0.001);

    }
    @Test
    public void testCalculateAdvStatisticsWhenPost10Comments0User10() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> testUser = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            testUser.add("user");
        }

        when(statisticsMock.usersNames()).thenReturn(testUser);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(1.0, forumStatistics.averagePostsPerUser, 0.001);
        Assert.assertEquals(0.0, forumStatistics.averageCommentsPerUser, 0.001);
        Assert.assertEquals(0.0, forumStatistics.averageCommentsPerPost, 0.001);

    }
    @Test
    public void testCalculateAdvStatisticsWhenPost1000Comments200User10() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> testUser = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            testUser.add("user");
        }

        when(statisticsMock.usersNames()).thenReturn(testUser);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(200);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(100.0, forumStatistics.averagePostsPerUser, 0.001);
        Assert.assertEquals(20.0, forumStatistics.averageCommentsPerUser, 0.001);
        Assert.assertEquals(0.2, forumStatistics.averageCommentsPerPost, 0.001);

    }
}