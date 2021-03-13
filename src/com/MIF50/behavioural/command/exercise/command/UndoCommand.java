package com.MIF50.behavioural.command.exercise.command;

import com.MIF50.behavioural.command.exercise.History;

public class UndoCommand implements Command {

    private final History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() > 0)
            history.pop().undo();
    }
}
