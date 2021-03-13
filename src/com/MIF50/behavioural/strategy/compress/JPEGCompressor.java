package com.MIF50.behavioural.strategy.compress;

public class JPEGCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println("compress image using JPEG");
    }
}
