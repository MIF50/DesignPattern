package com.MIF50.structural.bridge.implementation;


public class SamsungTV implements Device {

    @Override
    public void turnOn() {
        System.out.println("Samsung: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: turnOff");
    }

    @Override
    public void setChannel(int numbers) {
        System.out.println("Samsung: setChannel");
    }
}
