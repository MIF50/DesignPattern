package com.MIF50.visitor.exercise;

public interface AudioFilter {
    void apply(FactSegment factSegment);
    void apply(FormatSegment formatSegment);
}
