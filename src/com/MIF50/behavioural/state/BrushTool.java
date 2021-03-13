package com.MIF50.behavioural.state;

public class BrushTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("brush Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
