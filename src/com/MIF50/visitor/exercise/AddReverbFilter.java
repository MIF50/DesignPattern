package com.MIF50.visitor.exercise;

public class AddReverbFilter implements AudioFilter {

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("add-reverb-factSegment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("add-reverb-formatSegment");
    }
}
