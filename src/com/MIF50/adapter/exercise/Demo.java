package com.MIF50.adapter.exercise;

import com.MIF50.adapter.exercise.gmail.GmailClient;

public class Demo {

    public static void main(String[] args) {

        var clients = new EmailClient();
        clients.addProvider(new GmailAdapter(new GmailClient()));
        clients.downloadEmails();

    }
}
