package com.MIF50.behavioural.visitor.exercise;

public class FactSegment implements Segment {

    @Override
    public void applyFilter(AudioFilter audioFilter) {
        audioFilter.apply(this);
    }
}
