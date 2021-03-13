package com.MIF50.behavioural.observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements Observer {

    private final List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void priceChanged() {
        System.out.println("Price changed - Refreshing Status");
        show();
    }
}
