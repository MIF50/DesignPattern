package com.MIF50.behavioural.iterator.exercise;

import com.MIF50.behavioural.iterator.Iterator;
import java.util.ArrayList;
import java.util.List;

public class ProductCollection {

    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator<Product> createIterator() {
        return new ListIterator(this);
    }

    private static class ListIterator implements Iterator<Product> {

        private final ProductCollection productCollection;
        private int index;

        public ListIterator(ProductCollection productCollection) {
            this.productCollection = productCollection;
        }

        @Override
        public Product current() {
            return productCollection.products.get(index);
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public boolean hasNext() {
            return index < productCollection.products.size();
        }
    }
}
