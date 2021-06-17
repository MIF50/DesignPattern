package com.MIF50.behavioural.visitor.operation;

import com.MIF50.behavioural.visitor.AnchorNode;
import com.MIF50.behavioural.visitor.HeadingNode;

public class PlainTextOperation implements Operation {

    @Override
    public void apply(AnchorNode node) {
        System.out.println("plaintext-anchor");
    }

    @Override
    public void apply(HeadingNode node) {
        System.out.println("plaintext-heading");
    }
}
