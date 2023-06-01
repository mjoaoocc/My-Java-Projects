//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.academiadecodigo.nanderthals;

public class Genie {
    public int maxWishes;
    public String offerWish;
    public String grantWish;

    public Genie(int maxWishes) {
        this.maxWishes = maxWishes;
    }

    public String getOfferWish() {
        return this.offerWish;
    }

    public void getGrantWish() {
        this.maxWishes = this.maxWishes;
        if (this.maxWishes > 0) {
            System.out.println("Here's your wish");
            --this.maxWishes;
        } else {
            System.out.println("You are out of wishes");
        }

    }
}
