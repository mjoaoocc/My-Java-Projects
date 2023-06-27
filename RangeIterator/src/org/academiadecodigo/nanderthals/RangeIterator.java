package org.academiadecodigo.nanderthals;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {

    private int x;
    private int j;


    public RangeIterator(int i, int j) {

        this.x = i;
        this.j = j;

    }

    @Override
    public boolean hasNext() {
        return x <= j;
    }

    @Override
    public Integer next() {
        int value = x;
        x++;
        return value;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}