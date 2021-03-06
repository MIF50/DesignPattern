package com.MIF50.proxy;

public class Ebook {
    private final String fileName;

    public Ebook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loading the ebook " + fileName);
    }

    public void show() {
        System.out.println("showing the ebook "+ fileName);
    }

    public String getFileName() {
        return fileName;
    }
}
