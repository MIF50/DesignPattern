package com.MIF50.facade.exercise;

public class Demo {

    public static void main(String[] args) {
        var twitterService = new TwitterApi("appKey","secret");
        twitterService.getRecentTweet();
    }
}
