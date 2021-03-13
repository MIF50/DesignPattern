package com.MIF50.behavioural.mediator.obererver;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {

    private final List<EventHandler> eventHandlers = new ArrayList<>();

    protected void addEventHandlers(EventHandler handler) {
        eventHandlers.add(handler);
    }

    public void notifyEventHandler() {
        for (EventHandler eventHandler : eventHandlers)
            eventHandler.handle();
    }
}
