package com.MIF50.behavioural.strategy.compress;

public class PNGCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println("compress image using PNG");
    }
}
