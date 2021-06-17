package com.MIF50.structural.decorator.exercise;

public class ErrorDecorator implements AbstractArtefact {

    private final AbstractArtefact abstractArtefact;

    public ErrorDecorator(AbstractArtefact abstractArtefact) {
        this.abstractArtefact = abstractArtefact;
    }

    @Override
    public String render() {
        return error(abstractArtefact.render());
    }

    private String error(String name) {
        return String.format("%s %s", name, "[Error]");
    }
}
