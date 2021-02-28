package com.MIF50.mediator.exercise;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {

    private final List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    public void notifyEventHandler() {
        for (EventHandler eventHandler : eventHandlers)
            eventHandler.update();
    }
}
