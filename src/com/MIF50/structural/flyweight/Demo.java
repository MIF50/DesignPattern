package com.MIF50.structural.flyweight;

public class Demo {

    public static void main(String[] args) {
        var service = new PointService(new PointIconFactory());
        for (var point : service.getPoints()) {
            point.draw();
        }
    }
}
