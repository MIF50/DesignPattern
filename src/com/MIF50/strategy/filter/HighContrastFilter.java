package com.MIF50.strategy.filter;

public class HighContrastFilter implements Filter {

    @Override
    public void apply(String fileName) {
        System.out.println("applying high-contrast filter");
    }
}
