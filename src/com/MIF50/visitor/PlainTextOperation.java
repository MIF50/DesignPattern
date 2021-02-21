package com.MIF50.visitor;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(AnchorNode node) {
        System.out.println("plaintext-anchor");
    }

    @Override
    public void apply(HeadingNode node) {
        System.out.println("plaintext-heading");
    }
}
