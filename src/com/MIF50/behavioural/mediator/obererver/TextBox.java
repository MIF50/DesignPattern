package com.MIF50.behavioural.mediator.obererver;

public class TextBox extends UIControl {
     
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyEventHandler();
    }
}
