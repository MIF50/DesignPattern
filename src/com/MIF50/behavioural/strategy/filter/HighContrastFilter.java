package com.MIF50.behavioural.strategy.filter;

public class HighContrastFilter implements Filter {

    @Override
    public void apply(String fileName) {
        System.out.println("applying high-contrast filter");
    }
}
