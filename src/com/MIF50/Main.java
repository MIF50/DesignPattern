package com.MIF50;

import com.MIF50.observer.Chart;
import com.MIF50.observer.DataSource;
import com.MIF50.observer.SpreadSheet;

public class Main {

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
