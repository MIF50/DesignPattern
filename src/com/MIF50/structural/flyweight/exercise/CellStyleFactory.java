package com.MIF50.structural.flyweight.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CellStyleFactory {

    private final Map<Integer,CellStyle> cellStyles = new HashMap<>();

    public CellStyle getCellStyle(String fontFamily, int fontSize, boolean isBold) {
        // Generate a unique key for the combination of fontFamily, fontSize and isBold attributes.
        var hash = Objects.hash(fontFamily,fontSize,isBold);
        if (!cellStyles.containsKey(hash)){
            var cell = new CellStyle(fontFamily,fontSize,isBold);
            cellStyles.put(hash,cell);
        }
        return cellStyles.get(hash);
    }
}
