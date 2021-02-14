/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package no355;

import java.util.*;

class Twitter {
    // 我关注的
    Map<Integer, Set<Integer>> iFollow;
    Queue<Article> articleList;
    int index = 0;

    public Twitter() {
        iFollow = new HashMap<>();
        articleList = new PriorityQueue<>((o1, o2) -> o2.times.intValue() - o1.times.intValue());
    }

    public void postTweet(int userId, int tweetId) {
        index++;
        System.out.println("index = " + index);
        articleList.add(new Article(userId, tweetId, index));
        Set<Integer> set = iFollow.get(userId);
        if (set == null) {
            set = new HashSet<>();
            set.add(userId);
            iFollow.put(userId, set);
        }
    }

    public List<Integer> getNewsFeed(int userId) {
//        System.out.println("articleList.size() = " + articleList.size());
//        for (int i = 0; i < 8; i++) {
//            System.out.println("article.0 = " + articleList.poll().toString());
//        }
        for (Article article : articleList) {
            System.out.println("article.1 = " + article.toString());
        }
        Set<Integer> set = iFollow.get(userId);
        ArrayList<Article> list = new ArrayList<>(articleList);
//        list.sort((o1, o2) -> o2.times.intValue() - o1.times.intValue());
        for (Article article : list) {
            System.out.println("article.2 = " + article.toString());
        }
        ArrayList<Integer> res = new ArrayList<>();
        if (set == null) return res;
        for (Article article : list) {
            if (set.contains(article.userId)) {
                res.add(article.tweetId);
            }
            if (res.size() >= 10) return res;
        }
        return res;
    }

    public void follow(int followerId, int followeeId) {
        Set<Integer> set = iFollow.get(followerId);
        if (set == null) {
            set = new HashSet<>();
            set.add(followerId);
            set.add(followeeId);
            iFollow.put(followerId, set);
        } else {
            set.add(followeeId);
            iFollow.put(followerId, set);
        }
    }

    public void unfollow(int followerId, int followeeId) {
        Set<Integer> set = iFollow.get(followerId);
        if (followeeId != followerId) set.remove(new Integer(followeeId));
    }

    class Article {
        Integer userId;
        Integer tweetId;
        Integer times;

        public Article(int userId, int tweetId, int times) {
            this.userId = userId;
            this.tweetId = tweetId;
            this.times = times;
        }

        @Override
        public String toString() {
            return "Article{" +
                    "userId=" + userId +
                    ", tweetId=" + tweetId +
                    ", times=" + times +
                    '}';
        }
    }
}