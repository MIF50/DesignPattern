package com.MIF50.behavioural.command.exercise;

import com.MIF50.behavioural.command.exercise.command.SetContrastCommand;
import com.MIF50.behavioural.command.exercise.command.SetTextCommand;
import com.MIF50.behavioural.command.exercise.command.UndoCommand;

public class Demo {

    public static void main(String[] args) {

        var editor = new VideoEditor();
        var history = new History();

        var contrastCommand = new SetContrastCommand(2,history,editor);
        var textCommand = new SetTextCommand(editor,history,"video name");
        contrastCommand.execute();
        textCommand.execute();
        System.out.println(editor);

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        undoCommand.execute();
        System.out.println(editor);
    }
}
