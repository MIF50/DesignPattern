package com.MIF50.behavioural.memento;

public class Demo {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();
        editor.setContent("a1");
        editor.setTitle("t1");
        history.push(editor.createState());
        editor.setContent("b2");
        editor.setTitle("t2");
        history.push(editor.createState());
        editor.restore(history.pop());
        System.out.println(editor.getTitle() + editor.getContent());
        editor.restore(history.pop());
        System.out.println(editor.getTitle() + editor.getContent());

    }
}
