package com.MIF50.chainOfResponsibility;

public class Demo {

    public static void main(String[] args) {
        // authenticator -> logger -> compressor -> encryptor
        var encryptor = new Encryptor(null);
        var compressor = new Compressor(encryptor);
//        var logger = new Logger(compressor);
        var authenticator = new Authenticator(compressor);
        var webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin", "1234"));
    }
}
