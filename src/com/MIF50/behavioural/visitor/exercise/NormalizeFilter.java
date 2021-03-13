package com.MIF50.behavioural.visitor.exercise;

public class NormalizeFilter implements AudioFilter {

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("normalize-factSegment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("normalize-formatSegment");
    }
}
