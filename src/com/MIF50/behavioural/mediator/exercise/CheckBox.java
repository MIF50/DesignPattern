package com.MIF50.behavioural.mediator.exercise;

public class CheckBox extends UIControl {

    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
        notifyEventHandler();
    }
}
