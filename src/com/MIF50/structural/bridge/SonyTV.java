package com.MIF50.structural.bridge;

public class SonyTV implements Device {

    @Override
    public void turnOn() {
        System.out.println("Sony: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Soy: setChannel");
    }
}
