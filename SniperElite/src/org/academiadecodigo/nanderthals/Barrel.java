package org.academiadecodigo.nanderthals;

public class Barrel extends GameObject implements Hittable {

    @Override
    public String getMessage() {
        return "I'm a barrel - get drunk with my juice";
    }

    @Override
    public void hit(int points) {
        this.hit(10);

    }

    @Override
    public boolean isDestroyed() {
        return false;
    }
}
