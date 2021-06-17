package com.MIF50.behavioural.mediator.exercise;

public class Button extends UIControl {

    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandler();
    }
}
