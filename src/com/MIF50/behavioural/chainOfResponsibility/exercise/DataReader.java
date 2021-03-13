package com.MIF50.behavioural.chainOfResponsibility.exercise;

public abstract class DataReader {

    private DataReader next;

    public void setNext(DataReader next) {
        this.next = next;
    }

    public void read(String filename) {
        if (filename.endsWith(getExtension())) {
            this.doRead(filename);
            return;
        }

        if (next != null)
            next.read(filename);
        else
            throw new UnsupportedOperationException("File format not supported.");
    }

    protected abstract String getExtension();

    protected abstract void doRead(String filename);


//    public void read(String fileName) {
//        if (fileName.endsWith(".xls")) {
//            System.out.println("Reading data from an Excel spreadsheet.");
//        }
//        else if (fileName.endsWith(".numbers")) {
//            System.out.println("Reading data from a Numbers spreadsheet.");
//        }
//        else if (fileName.endsWith(".qbw")) {
//            System.out.println("Reading data from a QuickBooks file.");
//        }
//        else
//            throw new UnsupportedOperationException("File format not supported.");
//    }
}
