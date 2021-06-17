package com.MIF50.structural.bridge.feature;

import com.MIF50.structural.bridge.implementation.Device;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int number) {
        device.setChannel(number);
    }
}
