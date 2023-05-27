package org.academiadecodigo.bootcamp;

import java.util.Arrays;

public class Sandbox {

    public static void main(String[] args) {

        Emilio cat = new Emilio("Orange", "Scottish Fold", "Fat");

        //System.out.println(cat.getColor() + " is his color");
        //System.out.println(cat.getBreed() + " is his breed");
        //System.out.println(cat.getBody() + " is what he is!");
        System.out.println("Emilio is an " + cat.getColor() + " " + cat.getBreed() + ", and extremely " + cat.getBody());

        System.out.println("I'm goin on a diet.. Wish me luck!");

        //Behaviors:

        int[] meters = {1, 2, 3, 4, 5};
        int move = cat.moveArray(meters);
        //                                                                                                                                                                                                                                                                                                                                                         System.out.println("meters");

        cat.changeBody("Skinny");

        System.out.println("Now I'm " + cat.getBody() + "!");





    }


}
