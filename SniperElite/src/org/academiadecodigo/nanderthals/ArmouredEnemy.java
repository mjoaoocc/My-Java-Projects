package org.academiadecodigo.nanderthals;

public class ArmouredEnemy extends Enemy{

    public int armour;

    public ArmouredEnemy(int health, int armour){
        super(health);
        this.armour = armour;
    }


    @Override
    public void hit(int damage) {

        if (armour > damage){
            armour -= damage;
            return;
        }
        damage -= armour;
        armour = 0;
        super.hit(damage);
    }

    @Override
    public boolean isDestroyed() {
        return false;
    }
}
