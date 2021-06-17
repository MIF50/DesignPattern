package com.MIF50.structural.adapter.exercise;

import com.MIF50.structural.adapter.exercise.gmail.GmailClient;

public class GmailAdapter implements EmailProvider {

    private final GmailClient client;

    public GmailAdapter(GmailClient client) {
        this.client = client;
    }

    @Override
    public void downloadEmails() {
        client.connect();
        client.getEmails();
        client.disconnect();
    }
}
