package com.MIF50.behavioural.observer;

public class Demo {

    public static void main(String[] args) {

        var data = new DataSource();
        var chart = new Chart(data);
        var spreadSheet = new SpreadSheet(data);
        data.add(chart);
        data.add(spreadSheet);
        data.setValue(5);
        data.update();
        data.setValue(6);
        data.update();
        data.remove(spreadSheet);
        data.setValue(7);
        data.update();
    }
}
