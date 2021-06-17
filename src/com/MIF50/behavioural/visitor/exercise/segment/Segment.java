package com.MIF50.behavioural.visitor.exercise.segment;

import com.MIF50.behavioural.visitor.exercise.filter.AudioFilter;

public interface Segment {
    void applyFilter(AudioFilter audioFilter);
}
