package com.MIF50.command.exercise;

import com.MIF50.command.exercise.command.SetContrastCommand;
import com.MIF50.command.exercise.command.SetTextCommand;
import com.MIF50.command.exercise.command.UndoCommand;

public class Demo {

    public static void main(String[] args) {

        var editor = new VideoEditor();
        var history = new History();

        var command = new SetContrastCommand(2,history,editor);
        var textCommand = new SetTextCommand(editor,history,"video name");
        textCommand.execute();
        command.execute();
        System.out.println(editor);
        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(editor);
    }
}
