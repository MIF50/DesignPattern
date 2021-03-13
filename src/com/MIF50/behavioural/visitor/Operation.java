package com.MIF50.behavioural.visitor;

public interface Operation {
    void apply(AnchorNode node);
    void apply(HeadingNode node);
}
