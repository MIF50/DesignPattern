package com.MIF50.behavioural.chainOfResponsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandler(HttpRequest request) {
        var isValid = isValidHttpRequest(request);
        System.out.println("authenticate");
        return !isValid;
    }

    private boolean isValidHttpRequest(HttpRequest request) {
        return (request.getUsername().equals("admin") &&
                request.getPassword().equals("12345"));
    }
}
