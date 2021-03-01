package com.MIF50.adapter;

import com.MIF50.adapter.avaFilters.Caramel;

public class Demo {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel())); // reuse Caramel from library
    }
}
