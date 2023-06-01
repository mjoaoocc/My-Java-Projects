package org.academiadecodigo.carcrash.field;

public class Position {

    public int getCol() {
        int height = (int)Math.ceil(Math.random()* 25);
        return height;
    }

    public int getRow() {
        int width = (int)Math.ceil(Math.random()* 100);
        return width;
    }
}
