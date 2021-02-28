package com.MIF50.command.editor;

public class Demo {

    public static void main(String[] args) {
        var document = new HtmlDocument();
        document.setContent("Hello world");
        var history = new History();
        var boldDocument = new BoldDocument(document,history);
        boldDocument.execute();
        System.out.println(document.getContent());

        var uncommand = new UndoCommand(history);
        uncommand.execute();
        System.out.println(document.getContent());
    }
}
