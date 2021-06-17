package com.MIF50.behavioural.chainOfResponsibility;

public class Compressor extends Handler {

    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandler(HttpRequest request) {
        System.out.println("compress");
        return false;
    }
}
