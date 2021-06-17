package com.MIF50.structural.decorator.exercise;

public class MainDecorator implements AbstractArtefact {

    private final AbstractArtefact abstractArtefact;

    public MainDecorator(AbstractArtefact abstractArtefact) {
        this.abstractArtefact = abstractArtefact;
    }

    @Override
    public String render() {
        return main(abstractArtefact.render());
    }

    private String main(String name) {
        return String.format("%s %s", name, "[Main]");
    }
}
