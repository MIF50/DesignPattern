package com.MIF50.command.composite;

import com.MIF50.command.fx.Command;

import java.util.ArrayList;

public class CompositeCommand implements Command {

    private final ArrayList<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands)
            command.execute();
    }
}
