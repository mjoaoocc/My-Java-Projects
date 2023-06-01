package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;
import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.cars.CarFactory;
import org.academiadecodigo.carcrash.field.Field;

 public class Car {

    /** The position of the car on the grid */
    public Position pos;

    public Car(int col, int row) {
        this.pos = new Position(col, row);
    }

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return false;
    }
     @Override
     public String toString() {
         return "ÇA FODA ESTA MERDA";
     }
}
