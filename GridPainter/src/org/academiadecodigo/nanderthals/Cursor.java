package org.academiadecodigo.nanderthals;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Cursor implements KeyboardHandler {

    public Rectangle cursor;
    public Keyboard keyboard;
    public boolean isPrinted = false;
    public Rectangle field;
    private List<Rectangle> paintings = new ArrayList<>();


    public Cursor() {
        keyboard = new Keyboard(this);
        addKeyboard();
        cursor = new Rectangle(10, 10, 25, 25);
        cursor.setColor(Color.MAGENTA);
        cursor.fill();
    }


    private void addKeyboard() {
        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKey(39);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveRight);

        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKey(37);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveLeft);

        KeyboardEvent moveUp = new KeyboardEvent();
        moveUp.setKey(38);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveUp);

        KeyboardEvent moveDown = new KeyboardEvent();
        moveDown.setKey(40);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveDown);

        KeyboardEvent interact = new KeyboardEvent();
        interact.setKey(KeyboardEvent.KEY_E);
        interact.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(interact);

        KeyboardEvent deletePaint = new KeyboardEvent();
        deletePaint.setKey(KeyboardEvent.KEY_SPACE);
        deletePaint.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(deletePaint);

    }

    private void setPrinted(boolean isPrinted) {
        this.isPrinted = isPrinted;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        int keyPressed = keyboardEvent.getKey();

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_RIGHT:
                moveRight();
                break;

            case KeyboardEvent.KEY_LEFT:
                moveLeft();
                break;

            case KeyboardEvent.KEY_UP:
                moveUp();
                break;
            case KeyboardEvent.KEY_DOWN:
                moveDown();
                break;

            case KeyboardEvent.KEY_E:
                print();
                break;

            case KeyboardEvent.KEY_SPACE:
                delete();
                break;

            /*case KeyboardEvent.KEY_S:
                savePainting();
                break;

            case KeyboardEvent.KEY_L:
                loadPreviousPainting();
                break;

            case KeyboardEvent.KEY_C:
                clearPainting();
                break;*/
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public void moveRight() {
        if (cursor.getX() < 975) {
            cursor.translate(25, 0);
        }
    }

    public void moveLeft() {
        if (cursor.getX() >= 0) {
            cursor.translate(-25, 0);
        }
    }

    public void moveUp() {
        if (cursor.getY() <= 1000) {
            cursor.translate(0, -25);
        }
    }

    public void moveDown() {
        if (cursor.getY() >= 0 && cursor.getY() < 975) {
            cursor.translate(0, 25);
        }
    }

    public void delete() {
        if (field != null){
            field.delete();
            field = null;
            isPrinted = false;
        }

    }

        /*private void savePainting() {
            paintings.add(field.());
        }

        private void loadPreviousPainting() {
            if (!paintings.isEmpty()) {
                field.delete();

                field = paintings.remove(paintings.size() - 1);
                field.draw();
            }
        }

        private void clearPainting() {
            for (Rectangle painting : paintings) {
                painting.delete();
            }
            paintings.clear();
        }
    }*/


    public void print() {
        //if (isPrinted == false) {
        field = new Rectangle(cursor.getX(), cursor.getY(), 25, 25);
        field.setColor(Color.GREEN);
        field.fill();
        setPrinted(true);
        return;
        //}
        /*if (isPrinted == true) {
            field.setColor(Color.ORANGE);
            field.fill();
            setPrinted(false);
        }*/
    }

}


