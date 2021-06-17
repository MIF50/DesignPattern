package com.MIF50.behavioural.chainOfResponsibility.exercise;

public class NumbersReader extends DataReader {

    @Override
    protected String getExtension() {
        return ".numbers";
    }

    @Override
    protected void doRead(String filename) {
        System.out.println("Reading data from a Numbers spreadsheet.");
    }
}
