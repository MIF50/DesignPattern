package com.MIF50.behavioural.observer;

public class Demo {

    public static void main(String[] args) {
        var data = new DataSource();
        data.add(new Chart(data));
        data.add(new SpreadSheet(data));
        data.setValue(5);
        data.update();
        data.setValue(6);
        data.update();
    }
}
