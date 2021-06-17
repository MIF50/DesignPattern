package com.MIF50.behavioural.visitor.exercise;

import com.MIF50.behavioural.visitor.exercise.filter.AudioFilter;
import com.MIF50.behavioural.visitor.exercise.segment.FactSegment;
import com.MIF50.behavioural.visitor.exercise.segment.FormatSegment;
import com.MIF50.behavioural.visitor.exercise.segment.Segment;

import java.util.ArrayList;
import java.util.List;

public class WavFile {

    private final List<Segment> segments = new ArrayList<>();

    public static WavFile read(String fileName) {
        // Simulate reading a wav file and building the segments
        var wavFile = new WavFile();
        wavFile.segments.add(new FormatSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());

        return wavFile;
    }

    public void execute(AudioFilter audioFilter) {
        for (Segment segment : segments)
            segment.applyFilter(audioFilter);
    }
}
