package com.MIF50.behavioural.command.editor;

public class UndoCommand implements Command {

    private final History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (!history.isEmpty())
            history.pop().undo();
    }
}
