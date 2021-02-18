package com.MIF50.chainOfResponsibility;

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
