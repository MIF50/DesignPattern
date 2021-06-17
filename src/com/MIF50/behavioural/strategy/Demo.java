package com.MIF50.behavioural.strategy;

import com.MIF50.behavioural.strategy.compress.JPEGCompressor;
import com.MIF50.behavioural.strategy.compress.PNGCompressor;
import com.MIF50.behavioural.strategy.filter.BWFilter;
import com.MIF50.behavioural.strategy.filter.HighContrastFilter;

public class Demo {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("a",new JPEGCompressor(),new BWFilter());
        imageStorage.store("a",new PNGCompressor(),new HighContrastFilter());
    }
}
