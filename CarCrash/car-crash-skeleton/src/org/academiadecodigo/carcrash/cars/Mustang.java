package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;
import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.cars.CarFactory;
import org.academiadecodigo.carcrash.field.Field;

public class Mustang extends Car{

    public Mustang (Position position){
        super(position.getCol(), position.getRow());
    }

    @Override
    public String toString() {
        return "M";
    }
    public Position getPos() {
        return pos;
    }

}
