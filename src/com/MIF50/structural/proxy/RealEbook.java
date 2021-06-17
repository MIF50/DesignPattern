package com.MIF50.structural.proxy;

public class RealEbook implements Ebook {

    private final String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loading the ebook " + fileName);
    }

    @Override
    public void show() {
        System.out.println("showing the ebook "+ fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
