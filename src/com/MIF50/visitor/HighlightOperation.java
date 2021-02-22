package com.MIF50.visitor;

public class HighlightOperation implements Operation {

    @Override
    public void apply(AnchorNode node) {
        System.out.println("highlight-anchor");
    }

    @Override
    public void apply(HeadingNode node) {
        System.out.println("highlight-heading");
    }
}
