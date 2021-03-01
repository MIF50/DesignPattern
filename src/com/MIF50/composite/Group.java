package com.MIF50.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {

    private final List<Component> components = new ArrayList<>();

    public void add(Component object) {
        components.add(object);
    }

    @Override
    public void render() {
        for (var component : components)
            component.render();
    }

    @Override
    public void move() {
        for (var component : components)
            component.move();
    }
}
