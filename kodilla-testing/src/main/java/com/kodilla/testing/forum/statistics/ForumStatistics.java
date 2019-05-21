package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;


public class ForumStatistics {
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;
    Statistics statistics;
    int usersAmount;
    int postsAmount;
    int commentsAmount;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    void calculateAdvStatistics(Statistics statistics) {
        commentsAmount = statistics.commentsCount();
        postsAmount = statistics.postsCount();
        usersAmount = statistics.usersNames().size();

        if (statistics.usersNames().size()!=0) {
            averagePostsPerUser = statistics.postsCount() / statistics.usersNames().size();
        } else {
            averagePostsPerUser = 0;
        }
        if (statistics.usersNames().size()!=0) {
            averageCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        } else {
            averageCommentsPerUser = 0;
        }
        if (statistics.postsCount()!=0) {
            averageCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        } else {
            averageCommentsPerPost = 0;
        }
    }
    void showStatistics() {
        System.out.println("Amount of comments: " + commentsAmount);
        System.out.println("Amount of posts: " + postsAmount);
        System.out.println("Amount of users: " + usersAmount);
        System.out.println("Average number of posts per user: " + averagePostsPerUser);
        System.out.println("Average number of comments per user: " + averageCommentsPerUser);
        System.out.println("Average number of comments per post: " + averageCommentsPerPost);
    }
}

