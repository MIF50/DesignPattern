package com.MIF50.behavioural.chainOfResponsibility;

public class Encryptor extends Handler{

    public Encryptor(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandler(HttpRequest request) {
        System.out.println("Encryption");
        return false;
    }
}
