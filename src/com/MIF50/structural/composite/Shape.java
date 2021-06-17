package com.MIF50.structural.composite;

public class Shape implements Component {

    @Override
    public void render() {
        System.out.println("render shape");
    }

    @Override
    public void move() {
        System.out.println("move shape");
    }
}
