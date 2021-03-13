package com.MIF50.behavioural.command.composite;

import com.MIF50.behavioural.command.fx.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("apply black and white command");
    }
}
