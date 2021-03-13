package com.MIF50.behavioural.state.control;

public abstract class UIControl {

    public void enable() {
        System.out.println("Enabled");
    }

    public abstract void draw();
}
