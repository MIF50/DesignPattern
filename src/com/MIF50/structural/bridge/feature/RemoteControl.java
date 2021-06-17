package com.MIF50.structural.bridge.feature;

import com.MIF50.structural.bridge.implementation.Device;

public class RemoteControl {

    protected final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}
