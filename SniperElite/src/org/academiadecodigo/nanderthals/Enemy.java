package org.academiadecodigo.nanderthals;

public abstract class Enemy extends GameObject implements Hittable{
    private int health;

    public Enemy(int health){
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
    public boolean isDead() {
        return health <= 0;
    }

    public void hit(int damage) {
        health = health - damage > 0 ? health - damage : 0;
    }
    @Override
    public String getMessage(){
        return "Got'emmm";
    }
}
