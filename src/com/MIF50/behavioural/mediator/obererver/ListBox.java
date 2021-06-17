package com.MIF50.behavioural.mediator.obererver;

public class ListBox extends UIControl {

    private String selection;

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyEventHandler();
    }
}
