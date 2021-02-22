package com.MIF50.strategy;

import com.MIF50.strategy.compress.Compressor;
import com.MIF50.strategy.filter.Filter;

public class ImageStorage {

    private final Compressor compressor;
    private final Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        // compress
        compressor.compress(fileName);

        // filter
        filter.apply(fileName);
    }
}
