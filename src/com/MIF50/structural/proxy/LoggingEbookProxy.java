package com.MIF50.structural.proxy;

public class LoggingEbookProxy implements Ebook {

    private final String fileName;
    private RealEbook ebook;

    public LoggingEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if (ebook == null)
            ebook = new RealEbook(fileName);
        System.out.println("Logging");
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
