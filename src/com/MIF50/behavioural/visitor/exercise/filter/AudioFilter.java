package com.MIF50.behavioural.visitor.exercise.filter;

import com.MIF50.behavioural.visitor.exercise.segment.FactSegment;
import com.MIF50.behavioural.visitor.exercise.segment.FormatSegment;

public interface AudioFilter {
    void apply(FactSegment factSegment);
    void apply(FormatSegment formatSegment);
}
