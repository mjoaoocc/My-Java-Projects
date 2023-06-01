package org.academiadecodigo.carcrash.field;
import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.cars.CarFactory;
import org.academiadecodigo.carcrash.field.Field;

public class Position {

    public int col;
    public int row;

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public Position(int col, int row) {
        this.col = (int) (Math.random() * Field.width);
        this.row = (int) (Math.random() * Field.height);
    }


}
