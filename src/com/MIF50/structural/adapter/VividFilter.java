package com.MIF50.structural.adapter;

public class VividFilter implements Filter {

    @Override
    public void apply(Image image) {
        System.out.println("Applying vivid Filter");
    }
}
