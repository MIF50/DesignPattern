package com.MIF50.structural.adapter;

import com.MIF50.structural.adapter.avaFilters.Caramel;

public class Demo {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel())); // reuse Caramel from library // using composition
        imageView.apply(new CaramelAdapter()); // using inheritance
    }
}
