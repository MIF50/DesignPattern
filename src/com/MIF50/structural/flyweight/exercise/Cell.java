package com.MIF50.structural.flyweight.exercise;

public class Cell {

    private final int row;
    private final int column;
    private String content;
    private CellStyle style;

    public Cell(int row, int column,CellStyle style) {
        this.row = row;
        this.column = column;
        this.style = style;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CellStyle getStyle() {
        return style;
    }

    public void setStyle(CellStyle style) {
        this.style = style;
    }

    public void render() {
        System.out.printf("(%d, %d): %s [%s]\n", row, column, content, style.getFontFamily());
    }
}

