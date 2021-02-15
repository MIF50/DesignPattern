package com.MIF50.command.composite;

import com.MIF50.command.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("apply resize command");
    }
}
