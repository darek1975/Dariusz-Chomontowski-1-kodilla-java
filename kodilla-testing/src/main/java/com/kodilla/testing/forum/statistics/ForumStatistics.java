package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;


public class ForumStatistics {

    private Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUsersAmount() {
        int usersAmount = statistics.usersNames().size();
        return usersAmount;
    }

    public int getPostsAmount() {
        int postsAmount = statistics.postsCount();
        return postsAmount;
    }

    public int getCommentsAmount() {
        int commentsAmount = statistics.commentsCount();
        return commentsAmount;
    }

    public double getAveragePostsAmountPerUser() {
        double averagePostAmountPerUser = statistics.postsCount() / statistics.usersNames().size();
        return averagePostAmountPerUser;
    }

    public double getAverageCommentsAmountPerUser() {
        double averageCommentsAmountPerUser = statistics.commentsCount() / statistics.usersNames().size();
        return averageCommentsAmountPerUser;
    }

    public double getAverageCommentsAmountPerPost() {
        double averageCommentsAmountPerPost = statistics.commentsCount() / statistics.postsCount();
        return averageCommentsAmountPerPost;
    }

    void calculateAdvStatistics(Statistics statistics) {

        int usersAmount = statistics.usersNames().size();
        int postsAmount = statistics.postsCount();
        int commentsAmount = statistics.commentsCount();
        double averagePostAmountPerUser = statistics.postsCount() / statistics.usersNames().size();
        double averageCommentsAmountPerUser = statistics.commentsCount() / statistics.usersNames().size();
        double averageCommentsAmountPerPost = statistics.commentsCount() / statistics.postsCount();

        /*statisticsList.add(usersAmount);
        statisticsList.add(postsAmount);
        statisticsList.add(commentsAmount);
        statisticsList.add(averagePostAmountPerUser);
        statisticsList.add(averageCommentsAmountPerUser);
        statisticsList.add(averageCommentsAmountPerPost);*/
    }



}

