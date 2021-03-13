package com.MIF50.structural.facade;

public class NotificationService {

    public void send(String content, String target) {
        var server = new NotificationServer();
        var connection = server.connection("ip");
        var authToken = server.authenticate("appid","key");
        var message = new Message(content);
        server.send(authToken,message,target);
        connection.disconnect();
    }
}
