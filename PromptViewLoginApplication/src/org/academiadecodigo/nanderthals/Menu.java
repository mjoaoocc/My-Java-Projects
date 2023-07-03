package org.academiadecodigo.nanderthals;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

public class Menu {
    Prompt prompt = new Prompt(System.in, System.out);

    String[] options = {"Shirt", "Jeans", "Skirt", "Skirt", "Dress"};

    public void Choice(){
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage("What would you like to buy today?");

        int answerIndex = prompt.getUserInput(scanner);
        System.out.println("You want to buy " + options[answerIndex - 1]);
}
}