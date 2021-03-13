package com.MIF50.behavioural.template.exercise;

public class ChatWindow extends  Window {

    @Override
    protected void beforeClose() {
        System.out.println("before close chat window");
    }

    @Override
    public void close() {
        super.close();
    }

    @Override
    protected void afterClose() {
        System.out.println("after close chat window");
    }
}
