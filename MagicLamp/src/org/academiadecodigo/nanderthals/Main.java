package org.academiadecodigo.nanderthals;

public class Main {
    public static void main(String[] args) {

        MagicLamp lamp1 = new MagicLamp(3);
        new Genie(3);
        Genie genie1 = lamp1.rubLamp();
        System.out.println(genie1.maxWishes);
        genie1.getGrantWish();
        genie1.getGrantWish();
        lamp1.rubLamp();
        lamp1.rubLamp();
        lamp1.rubLamp();
    }
}
