package org.academiadecodigo.nanderthals;

public class SoldierEnemy extends Enemy{

    public SoldierEnemy(int health) {
        super(health);
    }

    @Override
    public boolean isDestroyed() {
        return false;
    }
}
