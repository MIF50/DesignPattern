package com.MIF50.behavioural.visitor;

import com.MIF50.behavioural.visitor.operation.Operation;

public class HeadingNode implements HtmlNode {

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
