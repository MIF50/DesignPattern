package com.MIF50.behavioural.command.fx;

import com.MIF50.behavioural.command.CustomService;

public class AddCustomCommand implements Command {

    private final CustomService customService;

    public AddCustomCommand(CustomService customService) {
        this.customService = customService;
    }

    @Override
    public void execute() {
        customService.addCustomer();
    }
}
