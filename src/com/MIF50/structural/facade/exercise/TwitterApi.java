package com.MIF50.structural.facade.exercise;

import java.util.List;

public class TwitterApi {

    private final String appKey;
    private final String secret;

    public TwitterApi(String appKey, String secret) {
        this.appKey = appKey;
        this.secret = secret;
    }

    public List<Tweet> getRecentTweet() {
        var twitterClient = new TwitterClient();
        return twitterClient.getRecentTweets(getAccessToken());
    }

    private String getAccessToken() {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(appKey, secret);
        return oauth.getAccessToken(requestToken);
    }
}
