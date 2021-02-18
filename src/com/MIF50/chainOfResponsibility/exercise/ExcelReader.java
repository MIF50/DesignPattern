package com.MIF50.chainOfResponsibility.exercise;

public class ExcelReader extends DataReader{

    @Override
    protected String getExtension() {
        return ".xls";
    }

    @Override
    protected void doRead(String filename) {
        System.out.println("Reading data from an Excel spreadsheet.");
    }
}
