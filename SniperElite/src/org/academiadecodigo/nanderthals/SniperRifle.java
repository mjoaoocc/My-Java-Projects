package org.academiadecodigo.nanderthals;

public class SniperRifle {

    public static final double HIT_PROBABILITY = 0.7;

    private int shotsFired;
    private int bulletDamage = 1;


    public SniperRifle(int bulletDamage){
        this.bulletDamage = bulletDamage;
    }

    public int getShotsFired() {
        return shotsFired;
    }

    public void shoot(Hittable target) {

        shotsFired++;

        if (Math.random() < HIT_PROBABILITY) {
            target.hit(bulletDamage);
            System.out.println("It's a hit!");
        } else {
            System.out.println("It's a miss!");
        }
    }
}
