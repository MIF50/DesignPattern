package com.MIF50.behavioural.strategy.filter;

public class BWFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("applying BWFilter");
    }
}
