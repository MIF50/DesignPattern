package com.MIF50.behavioural.visitor.exercise.filter;

import com.MIF50.behavioural.visitor.exercise.segment.FactSegment;
import com.MIF50.behavioural.visitor.exercise.segment.FormatSegment;

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
