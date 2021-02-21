package com.MIF50.visitor.exercise;

public class ReduceNoiseFilter implements AudioFilter {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("reduce-noise-factSegment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("reduce-noise_formatSegment");
    }
}
