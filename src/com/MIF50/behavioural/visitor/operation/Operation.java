package com.MIF50.behavioural.visitor.operation;

import com.MIF50.behavioural.visitor.AnchorNode;
import com.MIF50.behavioural.visitor.HeadingNode;

public interface Operation {
    void apply(AnchorNode node);
    void apply(HeadingNode node);
}
