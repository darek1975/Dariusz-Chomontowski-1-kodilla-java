package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuit {
    @Test
    public void testGetAveragePostAmount0PerUser0() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        int postsAmountTest = 130;
        int commentsAmountTest = 130;
        ArrayList<String> userList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            userList.add("user");
        }
        when(statisticsMock.postsCount()).thenReturn(postsAmountTest);
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmountTest);
        //When
        double averageAmountOfPostsPerUserTest = forumStatistics.getAveragePostsAmountPerUser();
        double averageAmountOfCommentsPerUserTest = forumStatistics.getAverageCommentsAmountPerUser();
        double averageAmountOfCommentsPerPost = forumStatistics.getAverageCommentsAmountPerPost();

        //Then
        Assert.assertEquals(1.3, averageAmountOfPostsPerUserTest, 0.001);
        Assert.assertEquals(1.3, averageAmountOfCommentsPerUserTest, 0.001);
        Assert.assertEquals(1, averageAmountOfCommentsPerPost, .001);
    }
}
