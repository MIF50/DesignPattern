package com.MIF50.chainOfResponsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandler(HttpRequest request) {
        var isValid = (request.getUsername().equals("admin") &&
                request.getPassword().equals("1234"));
        System.out.println("authenticate");
        return !isValid;
    }
}
