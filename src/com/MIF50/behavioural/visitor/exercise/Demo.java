package com.MIF50.behavioural.visitor.exercise;

public class Demo {
    public static void main(String[] args) {
        var wave = WavFile.read("file.wav");
        wave.execute(new NormalizeFilter());
        wave.execute(new ReduceNoiseFilter());
        wave.execute(new AddReverbFilter());
    }
}
