package org.academiadecodigo.bootcamp;

public class Numbergenerator {

    public static void main(String[] args) {
        Game game = new Game();

        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int target = 7;


        //System.out.println(target);

        for (int i = 0; i < 10; i++) {
            int random = (int) ((Math.random() * range) + min);
            System.out.println(random);
            if (random == target) {
                System.out.println("You guessed it!");
                break;
            }

        }
    }
}



