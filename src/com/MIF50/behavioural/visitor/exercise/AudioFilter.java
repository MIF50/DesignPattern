package com.MIF50.behavioural.visitor.exercise;

public interface AudioFilter {
    void apply(FactSegment factSegment);
    void apply(FormatSegment formatSegment);
}
