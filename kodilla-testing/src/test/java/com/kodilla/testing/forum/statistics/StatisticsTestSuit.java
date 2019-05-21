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
    public void after(){
        System.out.println("Test Case: end");
            }
    @Test
    public void testCalculateAdvStatisticsWhenPostsOComments120UsersO() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> testUsers = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(120);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(0, forumStatistics.averagePostsPerUser, 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenPost20Comments20User100() {
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
        Assert.assertEquals(0, forumStatistics.averagePostsPerUser, 0.001);
    }


}
