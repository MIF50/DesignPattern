package com.MIF50.chainOfResponsibility.exercise;

public class Demo {
    public static void main(String[] args) {
        var reader =  DataReaderFactory.getDataReaderChain();
        reader.read("data.xls");
        reader.read("data.numbers");
        reader.read("data.qbw");
//        reader.read("data.jpg");

    }
}
