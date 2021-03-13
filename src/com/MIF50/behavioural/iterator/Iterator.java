package com.MIF50.behavioural.iterator;

public interface Iterator<T> {
    T current();
    void next();
    boolean hasNext();
}
