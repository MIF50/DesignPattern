package com.MIF50.command.editor;

public interface UndoableCommand extends Command {
    void undo();
}
