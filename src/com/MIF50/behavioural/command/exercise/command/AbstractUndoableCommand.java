package com.MIF50.behavioural.command.exercise.command;

// the purpose of this class is to make sure all undoable commands have
// a VideoEditor and a History. Plus whenever a command is executed,
// it's pushed in the history. This way, we don't have to remember to
// store each individual command in this history.

import com.MIF50.behavioural.command.exercise.History;
import com.MIF50.behavioural.command.exercise.VideoEditor;

public abstract class AbstractUndoableCommand implements UndoableCommand {

    protected VideoEditor videoEditor;
    protected History history;

    public AbstractUndoableCommand(VideoEditor videoEditor, History history) {
        this.videoEditor = videoEditor;
        this.history = history;
    }

    @Override
    public void execute() {
        // Another application of the template method pattern. This method
        // is defining a template for executing commands
        doExecute();
        history.push(this);
    }

    protected abstract void doExecute();
}
