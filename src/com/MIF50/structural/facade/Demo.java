package com.MIF50.structural.facade;

public class Demo {
    public static void main(String[] args) {
        var server = new NotificationService();
        server.send("Hello world","target_device");
    }
}
