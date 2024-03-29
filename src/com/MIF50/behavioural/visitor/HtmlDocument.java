package com.MIF50.behavioural.visitor;

import com.MIF50.behavioural.visitor.operation.Operation;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {

    private final List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node) {
        nodes.add(node);
    }

    public void execute(Operation operation) {
        for (HtmlNode node : nodes)
            node.execute(operation);
    }
}
