package org.academiadecodigo.nanderthals;


import java.util.Iterator;

public class RangeTest {
    public static void main(String[] args) {
        Range range = new Range(-5, 5);

        /*Iterator<Integer> it = range.iterator();
        while(it.hasNext()){
            int i = it.next();
            System.out.println(i);
        }*/

        Iterator<Integer> it = range.iterator();
        it.remove();
        System.out.println(it);

    }

        /*
        //ENHANCED FOR
        for (int num : range) {
            System.out.println(num);
        }
    */
}

