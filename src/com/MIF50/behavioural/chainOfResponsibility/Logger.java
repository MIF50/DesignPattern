package com.MIF50.behavioural.chainOfResponsibility;

public class Logger extends Handler{

    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandler(HttpRequest request) {
        System.out.println("Log");
        return false;
    }
}
