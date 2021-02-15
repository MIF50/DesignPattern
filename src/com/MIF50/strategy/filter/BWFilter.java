package com.MIF50.strategy.filter;

public class BWFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("applying BWFilter");
    }
}
