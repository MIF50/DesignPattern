package com.MIF50.flyweight;

public class Point {
    private final int x; // 4 bytes
    private final int y; // 4 bytes
    private final PointIcon pointIcon;

    public Point(int x, int y, PointIcon pointIcon) {
        this.x = x;
        this.y = y;
        this.pointIcon = pointIcon;
    }

    public void draw() {
        System.out.printf("%s at (%d,%d)" ,pointIcon.getType(),x,y);
    }
}
