package com.MIF50.behavioural.command.exercise.command;

import com.MIF50.behavioural.command.exercise.History;
import com.MIF50.behavioural.command.exercise.VideoEditor;

public class SetTextCommand extends AbstractUndoableCommand{

    private final String text;

    public SetTextCommand(VideoEditor videoEditor, History history, String text) {
        super(videoEditor, history);
        this.text = text;
    }

    @Override
    protected void doExecute() {
        videoEditor.setText(text);
    }

    @Override
    public void undo() {
        videoEditor.removeText();
    }
}
