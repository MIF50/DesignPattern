package com.MIF50.behavioural.mediator.obererver;

public class Button extends UIControl {

    private boolean isEnable;

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
        notifyEventHandler();
    }
}
