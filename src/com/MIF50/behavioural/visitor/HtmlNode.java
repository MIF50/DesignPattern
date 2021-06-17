package com.MIF50.behavioural.visitor;

import com.MIF50.behavioural.visitor.operation.Operation;

public interface HtmlNode {
    void execute(Operation operation);
}
