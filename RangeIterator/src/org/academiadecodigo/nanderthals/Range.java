package org.academiadecodigo.nanderthals;

import java.util.Iterator;

public class Range implements Iterable<Integer>{
    private int i;
    private int j;

    public Range(int i, int j) {
        this.i = i;
        this.j = j;

    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(i, j);

    }

}

