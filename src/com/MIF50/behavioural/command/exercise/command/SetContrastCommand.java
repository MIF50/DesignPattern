package com.MIF50.behavioural.command.exercise.command;

import com.MIF50.behavioural.command.exercise.History;
import com.MIF50.behavioural.command.exercise.VideoEditor;

public class SetContrastCommand extends AbstractUndoableCommand {

    private final float prevContrast;
    private final float contrast;

    public SetContrastCommand(float contrast, History history, VideoEditor editor) {
        super(editor,history);
        prevContrast = editor.getContrast();
        this.contrast = contrast;
    }

    @Override
    protected void doExecute() {
        videoEditor.setContrast(contrast);
    }

    @Override
    public void undo() {
     videoEditor.setContrast(prevContrast);
    }

}
