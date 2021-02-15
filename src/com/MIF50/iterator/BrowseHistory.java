package com.MIF50.iterator;


public class BrowseHistory {

    private int count;
    private final String[] urls = new String[10];

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public Iterator<String > createIterator() {
        return new ArrayIterator(this);
    }

    private static class ArrayIterator implements Iterator<String> {

        private final BrowseHistory history;
        private int currentIndex;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public String current() {
            return history.urls[currentIndex];
        }

        @Override
        public void next() {
            currentIndex++;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < history.count;
        }
    }
}
