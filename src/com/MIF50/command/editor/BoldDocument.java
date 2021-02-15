package com.MIF50.command.editor;

public class BoldDocument implements UndoableCommand {

    private String prevContent;
    private final HtmlDocument document;
    private final History history;

    public BoldDocument(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.bold();
        history.push(this);
    }

    @Override
    public void undo() {
        document.setContent(prevContent);
    }
}
