package com.MIF50.behavioural.visitor.exercise.segment;

import com.MIF50.behavioural.visitor.exercise.filter.AudioFilter;

public class FormatSegment implements Segment {

    @Override
    public void applyFilter(AudioFilter audioFilter) {
        audioFilter.apply(this);
    }
}
