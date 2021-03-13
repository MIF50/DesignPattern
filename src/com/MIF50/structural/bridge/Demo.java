package com.MIF50.structural.bridge;


public class Demo {
    public static void main(String[] args) {
        var remoteControl = new AdvancedRemoteControl(new SonyTV());
        remoteControl.turnOn();
        remoteControl.setChannel(5);
    }
}
