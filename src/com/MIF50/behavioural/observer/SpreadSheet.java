package com.MIF50.behavioural.observer;

public class SpreadSheet implements Observer {

    private final DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Spread sheet got notified: "+ dataSource.getValue());
    }
}
