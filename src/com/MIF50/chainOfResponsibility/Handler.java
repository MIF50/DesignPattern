package com.MIF50.chainOfResponsibility;

public abstract class Handler {

    private final Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request) {
        if (doHandler(request))
            return;
        if (next != null)
            next.handle(request);
    }

    protected abstract boolean doHandler(HttpRequest request);
}
