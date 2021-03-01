package com.MIF50.adapter;

import com.MIF50.adapter.avaFilters.Caramel;

// Favor Composition Over Inheritance
public class CaramelAdapter extends Caramel implements Filter {

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
