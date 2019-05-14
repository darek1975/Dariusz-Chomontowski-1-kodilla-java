package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;


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

    public List<Double> calculateAdvStatistics (Statistics statistics) {

        double usersAmount = statistics.usersNames().size();
        double postsAmount = statistics.postsCount();
        double commentsAmount = statistics.commentsCount();
        double averagePostAmountPerUser = statistics.postsCount() / statistics.usersNames().size();
        double averageCommentsAmountPerUser = statistics.commentsCount() / statistics.usersNames().size();
        double averageCommentsAmountPerPost = statistics.commentsCount() / statistics.postsCount();

        List<Double> calculateAdvStatistics = new ArrayList<>();
        calculateAdvStatistics.add(usersAmount);
        calculateAdvStatistics.add(postsAmount);
        calculateAdvStatistics.add(commentsAmount);
        calculateAdvStatistics.add(averagePostAmountPerUser);
        calculateAdvStatistics.add(averageCommentsAmountPerUser);
        calculateAdvStatistics.add(averageCommentsAmountPerPost);
        return calculateAdvStatistics;
    }



}

