package com.MIF50.flyweight.exercise;

public class SpreadSheet {

    private final int MAX_ROWS = 3;
    private final int MAX_COLS = 3;
    // In a real app, these values should not be hardcoded here.
    // They should be read from a configuration file.
    private final CellStyleFactory factory;
    private final Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];

    public SpreadSheet(CellStyleFactory factory) {
        this.factory = factory;
        generateCells();
    }

    public void setContent(int row, int col, String content) {
        ensureCellExists(row, col);
        cells[row][col].setContent(content);
    }

    public void setFontFamily(int row, int col, String fontFamily) {
        ensureCellExists(row, col);
        var cell = cells[row][col];
        var currentStyle = cell.getStyle();
        var style = factory.getCellStyle(fontFamily,currentStyle.getFontSize(),currentStyle.isBold());
        cells[row][col].setStyle(style);
    }

    public void render() {
        for (var row = 0; row < MAX_ROWS; row++)
            for (var col = 0; col < MAX_COLS; col++)
                cells[row][col].render();
    }

    private CellStyle getDefaultStyle() {
        // In a real app, these values should not be hardcoded here.
        // They should be read from a configuration file.
        return new CellStyle("Times New Roman", 12, false);
    }


    private void ensureCellExists(int row, int col) {
        if (row < 0 || row >= MAX_ROWS)
            throw new IllegalArgumentException();

        if (col < 0 || col >= MAX_COLS)
            throw new IllegalArgumentException();
    }

    private void generateCells() {
        for (var row = 0; row < MAX_ROWS; row++)
            for (var col = 0; col < MAX_COLS; col++) {
                var cell = new Cell(row, col,getDefaultStyle());
                cells[row][col] = cell;
            }
    }
}

