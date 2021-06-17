package com.MIF50.structural.adapter;

import com.MIF50.structural.adapter.avaFilters.Caramel;

// Favor Composition Over Inheritance
// using inheritance
public class CaramelAdapter extends Caramel implements Filter {

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
