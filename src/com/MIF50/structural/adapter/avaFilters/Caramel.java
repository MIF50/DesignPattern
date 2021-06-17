package com.MIF50.structural.adapter.avaFilters;

import com.MIF50.structural.adapter.Image;

// this class from library I will create Adapter to use it
public class Caramel {

    public void init() {
        System.out.println("init Caramel");
    }

    public void render(Image image) {
        System.out.println("Applying Caramel Filter");
    }
}
