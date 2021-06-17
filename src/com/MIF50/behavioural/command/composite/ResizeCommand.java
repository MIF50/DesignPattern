package com.MIF50.behavioural.command.composite;

import com.MIF50.behavioural.command.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("apply resize command");
    }
}
