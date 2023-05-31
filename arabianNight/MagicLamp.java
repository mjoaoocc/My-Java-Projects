//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.academiadecodigo.nanderthals;

public class MagicLamp {
    public int numberOfRubs;

    public MagicLamp(int numberOfRubs) {
        this.numberOfRubs = numberOfRubs;
    }

    public Genie rubLamp() {
        if (this.numberOfRubs <= 0) {
            System.out.println("I don't have anymore Genies so here's a demon. Welcome to the dark side");
            RecyclableDemon recyclableDemon1 = new RecyclableDemon();
            return recyclableDemon1;
        } else if (this.numberOfRubs % 2 == 0) {
            System.out.println("A Friendly Genie was created, enjoy");
            FriendlyGenie friendlyGenie1 = new FriendlyGenie();
            --this.numberOfRubs;
            return friendlyGenie1;
        } else {
            System.out.println("A Grumpy Genie was created. Melhor que um estalo na cara");
            GrumpyGenie grumpyGenie1 = new GrumpyGenie();
            --this.numberOfRubs;
            return grumpyGenie1;
        }
    }
}
