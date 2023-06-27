package org.academiadecodigo.nanderthals;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid{

    public static final int PADDING = 10;
    private int xAxis = 10;
    private int yAxis = 10;
    private int counter;
    private int WIDTH = 1000;
    private int HEIGHT = 1000;
    private Rectangle grid;

    public Grid() {
        grid = new Rectangle(PADDING, PADDING, WIDTH, HEIGHT);
        grid.setColor(Color.CYAN);
        grid.draw();
    }

    public void field(){
        for (int i = 0; i < 100; i++) {
            while(xAxis < 1000 && yAxis < 1000){
                Rectangle field1 = new Rectangle(xAxis, yAxis, 25, 25);
                field1.setColor(Color.CYAN);
                counter++;
                xAxis += 25;
                field1.draw();
            }
            if(counter == 40){
                xAxis = 10;
                yAxis += 25;
                counter = 0;
            }
        }
    }
}
