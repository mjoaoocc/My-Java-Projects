package org.academiadecodigo.carcrash.cars;

public class CarFactory {

    public static  Car getNewCar() {
        int carRandomizer = (int) Math.floor(Math.random()*2);
        Car car;
        if(carRandomizer == 0) {
            car = new Fiat();
        } else {
            car = new Mustang();
        }
        return car;
    }
}
