package com.MIF50.behavioural.observer;

public class Chart implements Observer {

    private final DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart got notified: "+ dataSource.getValue());
    }
}
