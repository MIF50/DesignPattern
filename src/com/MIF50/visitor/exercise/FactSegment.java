package com.MIF50.visitor.exercise;

public class FactSegment implements Segment {
    @Override
    public void applyFilter(AudioFilter audioFilter) {
        audioFilter.apply(this);
    }
}
