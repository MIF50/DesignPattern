package com.MIF50.structural.bridge;

import com.MIF50.structural.bridge.feature.AdvancedRemoteControl;
import com.MIF50.structural.bridge.implementation.SonyTV;

public class Demo {
    public static void main(String[] args) {
        var remoteControl = new AdvancedRemoteControl(new SonyTV());
        remoteControl.turnOn();
        remoteControl.setChannel(5);
    }
}
