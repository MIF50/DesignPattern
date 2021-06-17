package com.MIF50.structural.proxy;


public class Demo {

    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a","b","c"};
        for (var fileName : fileNames)
            library.add(new LoggingEbookProxy(fileName));

        library.openEbook("a");
        library.openEbook("b");
    }
}
