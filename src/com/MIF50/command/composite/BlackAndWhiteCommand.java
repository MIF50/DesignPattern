package com.MIF50.command.composite;

import com.MIF50.command.fx.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("apply black and white command");
    }
}
