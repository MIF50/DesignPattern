package com.MIF50.behavioural.strategy;

import com.MIF50.behavioural.strategy.compress.Compressor;
import com.MIF50.behavioural.strategy.filter.Filter;

public class ImageStorage {


    public void store(String fileName,Compressor compressor, Filter filter) {
        // compress
        compressor.compress(fileName);

        // filter
        filter.apply(fileName);
    }
}
