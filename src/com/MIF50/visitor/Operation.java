package com.MIF50.visitor;

public interface Operation {
    void apply(AnchorNode node);
    void apply(HeadingNode node);
}
